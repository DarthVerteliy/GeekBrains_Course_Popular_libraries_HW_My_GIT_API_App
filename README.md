### GeekBrains_Course_AndroidOnKotlin_HW_My_Movie
---

### Домашнее задание к занятию №2-6

Студента GeekBrains ***Веремеенко Дмитрия***    
Факультет: ***Android-разработки***    
Курс: ***Android 5. Популярные библиотеки: RxJava 2, Dagger 2, Moxy***
### Комплексное задание: простое приложение "небольшой клиент, относящийся к API GitHub" реализующее архитектурный паттерн MVP
---    

### Текущий результат (презентация)
<p align="center">
  <img src="https://github.com/stdimensiy/GeekBrains_Course_Popular_libraries_HW_My_GIT_API_App/blob/master/snapshots/MyGit_1.jpg" width="150" title="Домашний фрагмент">
  <img src="https://github.com/stdimensiy/GeekBrains_Course_Popular_libraries_HW_My_GIT_API_App/blob/master/snapshots/MyGit_userInfo.jpg" width="150" title="Домашний фрагмент">

</p>    

---

### Задачи
- [X] ***Задача №1.1.***    Создать новый проект, созадть приложение на основе кода приведенного в
  методичке".
- [x] #4
- [X] ***Задача №1.3.***    На основе материала урока реализовать single-Activity-приложение,
  реализующее MVP через Moxy, а навигацию — с применением Cicerone, подготовить структуру для
  выполнения слудующих ДЗ.
- [X] ***Задача №2.1.***  #5  Переделать взаимодействие модели и логики в коде из второго урока на
  Rx-паттерн.
- [X] ***Задача №2.2.***  #6  Самостоятельно изучить оператор switchMap. Разобраться, как он работает
  и чем отличается от flatMap. Сформулировать и написать ответ в комментарии к практическому
  заданию. Для экспериментов можно воспользоваться приведённым на уроке примером с flatMap, заменив
  его на switchMap, а остальное оставить без изменений (необязательное / повышенной сложности)
- [ ] ***Задача №3.1.***    Соблюдая MVP, написать маленькое приложение, которое по нажатию кнопки
  читает файл-картинку формата jpg из файловой системы, а затем конвертирует её в png и записывает
  обратно в файловую систему. Чтение и запись должны производиться не в UI-потоке.    
  //... В рамках начатой работы над приложением API GitHub принято решение выполнить данное задание
  просто в отдельном фрагменте...//    
- [ ] ***Задача №3.2.***    Добавить в предыдущем примере возможность отказаться от проведения
  операции, выведя после начала в UI-поток диалоговое окно с надписью «Выполняется конвертация» и
  кнопкой «Отменить». Для наглядности замедлить процессы в фоновом потоке посредством метода
  sleep() (необязательное / повышенной сложности)    
- [ ] ***Задача №4.1.***    По клику на пользователя отобразите список его репозиториев,
  воспользовавшись полями repos_url в api и аннотациями @Url библиотеки retrofit.    
- [ ] ***Задача №4.2.***    По клику на репозиторий в списке отобразите экран с информацией о нём (
  например, количество форков)    
- [ ] ***Задача №5.1.***    Вытащить кеширование в отдельные классы RoomGithubUsersCache и
  RoomGithubRepositoriesCache. Организовать их внедрение в репозиторий через интерфейсы.    
- [ ] ***Задача №5.2.***    Реализовать свой кеш картинок, используя listener() библиотеки Glide.
  Картинки хранить на диске, а в Room — CahedImage(url, localPath). (Задание предназначено, чтобы
  поупражняться с Room...) (необязательное / повышенной сложности)    
- [ ] ***Задача №6.1.***    Вынести в модули все остальные зависимости, чтобы DI полностью
  сформировался через Dagger. Уберать лишние @Inject там, где они станут не нужны.    

### Отчет о выполнении:
---    
:heavy_check_mark: ***Задание №1.1.*** - Выполнено в полном объеме.-    
:heavy_check_mark: ***Задание №1.2.*** - Выполнено выполнено в полном объеме, с небольшими
дополнениями.-    
:heavy_check_mark: ***Задание №1.3.*** - Выполнено.-    
:heavy_check_mark: ***Задание №2.1.*** - Выполнено. (пока методы использовал в развернутом виде, без
лямбд, подписку организовал в главном потоке) -    
:heavy_check_mark: ***Задание №2.2.*** - Выполнено.-    
:writing_hand: ***Задание №3.1.*** - Выполняется.-    
:clock2: ***Задание №3.2.*** - Ожидает выполнения.-    
:lock: ***Задание №4.1.*** - Заблокировано (пока).-    
:lock: ***Задание №4.2.*** - Заблокировано (пока).-    
:lock: ***Задание №5.1.*** - Заблокировано (пока).-    
:lock: ***Задание №5.2.*** - Заблокировано (пока).-    
:lock: ***Задание №6.1.*** - Заблокировано (пока).-

---   

*StDimensiy 02.08.2021*
