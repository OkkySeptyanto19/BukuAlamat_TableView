package bukualamat.view;

import bukualamat.BukuAlamat;
import bukualamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {

    @FXML
    private TableView<DataPersonal> tabelPerson;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHp;
    
    private BukuAlamat kelasUtama;
    
    public ViewBukuAlamatController(){
    }
    
    @FXML
    private void initialize(){
        kolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().namadepanProperty());
        kolomNamaBelakang.setCellValueFactory(celldata->celldata.getValue().namabelakangProperty());
    }
    public void setKelasUtama(BukuAlamat bukualamat){
        this.kelasUtama = bukualamat;
        
        tabelPerson.setItems(kelasUtama.getDataPersonal());
    }

}
