package LAB.L8.task.first;

import java.util.List;
import java.util.Objects;

public class FillTable {
    private static final int NAME_INDEX = 0;
    private static final int DESCRIPTION_INDEX = 1;
    private static final int ADDRESS_INDEX = 2;

    public List< EmployeeData > items ;
    public FillTable ( List < EmployeeData > items ) {
        this.items = items;
    }

    public Object getValueAt(int row, int col){
        EmployeeData employeeData = (EmployeeData) items.get(row);

        switch (col){
            case NAME_INDEX:{
                return employeeData.getName();
            }
            case DESCRIPTION_INDEX:{
                return employeeData.getDescription();
            }
            case ADDRESS_INDEX:{
                return employeeData.getAddress();
            }
            default:{
                return "";
            }
        }
    }
}
