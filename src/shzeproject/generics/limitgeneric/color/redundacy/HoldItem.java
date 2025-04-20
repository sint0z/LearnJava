package shzeproject.generics.limitgeneric.color.redundacy;

/**
 *  Данный класс, да и и весь пакет предназначен для устранения
 *  избыточности в классах:
 *  Colored -> {@link shzeproject.generics.limitgeneric.color.Colored};
 *  ColoredDimension -> {@link shzeproject.generics.limitgeneric.color.ColoredDimension};
 *  Solid -> {@link shzeproject.generics.limitgeneric.color.Solid};
 *  Классы приведенные выше, хранят 1 объект, и каждый повторяет методы предыдущих,
 *  путем применения агрегации.
 *  Данный класс предназначен для хранения объекта.
 */
public abstract class HoldItem<T>{
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem(){
        return item;
    }

}
