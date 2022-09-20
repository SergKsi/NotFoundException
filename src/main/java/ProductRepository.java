public class ProductRepository {

    private Product[] items = new Product[0]; // изначально массив = 0

    // добавить элемент к массиву
    public void save(Product item) {
        if (findById(item.getId()) == null) {
            throw new AlreadyExistsException( // throw - кинь. throws - кидает
                    "Element with id: " + item.getId() + " found"
            );
        }
        Product[] tmp = new Product[items.length + 1]; // новый массив на 1 больше, чем старый.
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];                          // копируем все из старого массива в новый
        }
        tmp[tmp.length - 1] = item; // заполняем последнююю ячейку
        items = tmp;            // "переносим" элементы в массив
    }

    // удаляет элемент по id
    public void removeById(int id) {
        if (id < 0) {
            throw new NotFoundException( // throw - кинь. throws - кидает
                    "ID не может быть отрицательным " + id
            );
        }
        if (findById(id) != null) {
            throw new NotFoundException( // throw - кинь. throws - кидает
                    "Element with id: " + id + " not found"
            );
        }
        int count = 0; //  счетчик элементов в новом массиве
        Product[] tmp = new Product[items.length - 1]; // новый массив на 1 меньше, чем старый
        for (int i = 0; i < items.length; i++) {
            if (!(items[i].id == id)) {
                tmp[count] = items[i];
                count++;
            }
        }
        items = tmp;
    }

    // возвращает объект по идентификатору (либо null, если такого объекта нет)
//    public PosterItem[] findById(int id) {
//        PosterItem[] tmp = new PosterItem[1];
//        for (int i = 0; i < items.length; i++){
//            if (items[i].getId() == id) {
//                tmp[i] = items[i];
//            }
//        }
//        items = tmp;
//    }
    // поиск items по id
    public Product[] findById(int id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId() == id) { // если элемент по id Не найден возвращаем items
                return null;
            }
        }

//        for (Product items : getItems()) {
//            if (items.getId() != id) { // если элемент по id Не найден возвращаем items
//                return items;
//            }
//        }
        return items; // если элемент по id найден возвращаем null
    }

    // возвращает все запомненные элементы
    public Product[] getItems() {
        return items;
    }

}
