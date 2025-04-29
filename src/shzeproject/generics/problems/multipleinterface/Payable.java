package shzeproject.generics.problems.multipleinterface;

/* Если указать Payable<Employee>, а потом Hourly.class
 Расширить Employee.class и интерфейсом Payable<Hourly>
 программа не откомпилируется, но если убрать generic, или использовать
 тот тип который изначально указан в классе Employee
 все будет работать в штатном режиме и можно будет повторно реализовать интерфейс */
public interface Payable<T> {
}
