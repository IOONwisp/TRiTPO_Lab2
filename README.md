# Требования к проекту
---
### Содержание
1. [Введение](#1)
2. [Требования пользователя](#2) <br>
  2.1. [Программные интерфейсы](#2.1) <br>
  2.2. [Интерфейс пользователя](#2.2) <br>
  2.3. [Характеристики пользователей](#2.3) <br>
3. [Системные требования](#3) <br>
  3.1 [Функциональные требования](#3.1) <br>
  3.2 [Нефункциональные требования](#3.2) <br>
    3.2.1 [Атрибуты качества](#3.2.1) <br>
    3.2.2 [Ограничения](#3.2.2) <br>
4. [Описание игры](#4) <br>
  4.1 [Цель игры](#4.1) <br>
  4.2 [Правила игры](#4.2) <br>
  4.3 [Сложность](#4.3) <br>
5. [Аналоги](#5) <br>

### 1. Введение <a name="1"></a>
Данная игра относится к жанру аркадных игр. Классические аркады характеризуются следующими свойствами:
1)игра на одном экране. В классических аркадах весь игровой процесс сосредоточен на одном экране;<br>
2)бесконечная игра. Потенциально игроки могут играть в аркаду бесконечное время, и соответственно, не могут выиграть;<br>
3)игровой счёт. Практически все классические аркады включают в себя игровой счёт, когда игрок получает очки за выполнение различных целей или задач;<br>
4)быстрое обучение, простой игровой процесс. Для классических аркад характерно то, что игрокам легко научиться геймплею, но становится практически невозможным стать мастером в игре из-за её сложности;<br>
5)нет сюжета/истории. Классические аркады практически всегда избегали попыток рассказать какую-либо историю, и данная тенденция продолжается для современных аркад;<br>
Alien Invasion - аркадная игра, в которой предстоит управлять сверхзвуковой пушкой, чтобы не допустить вторжения инопланетян в свой дом.

### 2. Требования пользователя <a name="2"></a>
#### 2.1. Программные интерфейсы <a name="2.1"></a>
Присутствует интерфейс для связи графической оболочки с логической частью приложения. Для реализации графичческого интерфейса используется Inkscape. Inkscape — свободно распространяемый векторный графический редактор, удобен для создания как художественных, так и технических иллюстраций. Иллюстрации фона, существ и т.д. хранятся в папке с проектом. Информация о правилах игры и рекорде хранится в файлах в папке с проектом.
#### 2.2. Интерфейс пользователя <a name="2.2"></a>
- Экран меню

В меню находится главный функционал приложения.

  ![MenuScreen](https://github.com/Kyrsor/Alien-Invasion/blob/master/Images/Mockups/MenuScreen.png)

- Экран игры

В окне с игрой мы видим игровой процесс.

  ![GameScreen](https://github.com/Kyrsor/Alien-Invasion/blob/master/Images/Mockups/GameScreen1.png)

- "Экран рекорда"

На данном экране имееется информация  о самом большом набранном количестве очков

  ![HighScoreScreen](https://github.com/Kyrsor/Alien-Invasion/blob/master/Images/Mockups/HighScoreScreen.png)

- "Экран информации"

На данном экране находится описание игры с правилами.

  ![AboutScreen](https://github.com/Kyrsor/Alien-Invasion/blob/master/Images/Mockups/AboutScreen.png)

#### 2.3. Характеристики пользователей <a name="2.3"></a>
- Целевая аудитория

Игра простая и не требует много времени, поэтому она будет подходить людям любой возрастной категории, которым хотелось бы интересно провести свободное время.

### 3. Системные требования <a name="3"></a>
#### 3.1. Функциональные требования <a name="3.1"></a>
Пользователю предоставлены следующие возможности:
   1. Начать игру, нажав на кнопку "Start".
   2. Получить информацию о максимально набранном количестве очков в разделе "Highscore".
   3. Ознакомиться с правилами игры в разделе "About".
   4. Выход в меню после проигрыша.
   5. Осуществить выход из приложения при нажатии кнопки "Quit"

#### 3.2. Нефункциональные требования <a name="3.2"></a>
##### 3.2.1 Атрибуты качества <a name="3.2.1"></a>
- В игре должен быть понятный геймплей (понимание игры без обучения, за несколько минут).
- Кроссплатформенность (запуск под разными платформами). Это позволит расширить аудиторию пользователей данного приложения.
- Игра имеет низкие системные требования так как не задействует большое количство ресурсов компьютера.
##### 3.2.2 Ограничения <a name="3.2.2"></a>
Запуск приложения производится под любой операционной системой на которой установлен JVM.

### 4. Описание игры <a name="4"></a>
  ##### 4.1 Цель игры <a name="4.1"></a>
Набрать наибольшее возможное количество очков стреляя в пришельцев. 
  ##### 4.2 Правила игры <a name="4.2"></a>
  В данной игре пользователь управляет сверхзвуковой пушкой, которая стреляет в регулярно появляющихся инопланетян. Управление происходитс помощью мыши. После наведения прицела пушки на пришельца и нажатия на ЛКМ производится выстрел по существу. Разные монстры имеют разные показатели здоровья и разную ценность. Цель игры - убить как можно большее количество пришельцев, тем самым защитив свой дом от нашествия. При пересечении пришелцем территории участка,на котором располагается дом, пользователь проигрывает. 
  ##### 4.3 Сложность игры <a name="4.3"></a>
  Сложность игры увеличивается по мере прохождения. Чем больше существ убито, тем быстрее они телепортируются и стараются захватить твой дом.
### 5. Аналоги <a name="5"></a>
Plants vs. Zombies (рус. Растения против Зомби) — двухмерная компьютерная игра в жанре Tower Defense, разработанная и изданная компанией PopCap Games для Windows и Mac OS X в 2009 году. Стала первой в серии игр Plants vs. Zombies. Игра поступила в продажу 5 мая 2009 года и в тот же день стала доступна в Steam. Также 14 февраля 2010 года была выпущена упрощённая версия игры для iPhone и iPod touch всех поколений.Игрок защищает свой дом от атаки зомби, размещая на газоне рядом с домом различные растения. 