package flashGetter.view.tasktable;

import javax.swing.JFrame;
import javax.swing.JLabel;

import flashGetter.view.model.DownloadedTableModel;
import flashGetter.view.model.TaskTableModel;

/**
 * @author decaywood
 * 
 * 2015年1月30日
 * 
 * 
 */
public class DownloadedTable extends TaskTable<DownloadedTableModel>{
    

    @Override
    protected void initParameter() {
        // icon / string / string / bar / time / string
        addBundle(typeLabel, fileIconRenderer);
        addBundle(nameLabel, nameCellRenderer);
        addBundle(sizeLabel, sizeCellRenderer);
        addBundle(finishTimeLabel, timeCellRenderer);
        
    }
    
    
    public DownloadedTable() {
        
        super(new DownloadedTableModel());
        
    }
    
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
//        jFrame.add(new TaskTablePlatter(new DownloadedTable()));
        
        jFrame.setVisible(true);
        jFrame.pack();
        
    }

  

}
