package L8.task.second;

public enum Index {

    NAME{
        @Override
        public Object getInfo(EmployeeData employeeData) {
            return employeeData.getName();
        }
    },
    DESCRIPTION_INDEX{
        @Override
        public Object getInfo(EmployeeData employeeData) {
            return employeeData.getDescription();
        }
    },
    ADDRESS_INDEX{
        @Override
        public Object getInfo(EmployeeData employeeData) {
            return employeeData.getAddress();
        }
    };
    //public Index giveInfo (int a) {
    //    return  Index.values(a);
    //}

    public abstract Object getInfo(EmployeeData employeeData);
}
