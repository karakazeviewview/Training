CREATE DATABASE games_app
DEFAULT CHARACTER SET utf8
以下の２つのテーブルを作成せし、初期データを挿入せよ

CREATE TABLE `categories` (
  `id` int(11) PRIMARY KEY AUTO_INCREMENT,
  `category` varchar(10) NOT NULL
);

INSERT INTO `categories` (`id`, `category`)
VALUES
(1, 'アクションゲーム'),
(2, 'ローグライトゲーム'),
(3, 'シューティングゲーム'),
(4, 'パズルゲーム');
);

CREATE TABLE `hard` (
  `id` int(11) PRIMARY KEY AUTO_INCREMENT,
  `type` varchar(10) NOT NULL
);

INSERT INTO `hard` (`id`,`type`)
VALUES
(1,'ファミコン'),
(2,'プレイステーション'),
(3,'セガサターン'),
(4,'PC'),
(5,'スイッチ');

CREATE TABLE `games` (
  `id` int(11) PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `type_id` varchar(255) NOT NULL
);

INSERT INTO `games` (`id`, `title`, `cat_id`, `price`, `type_id`)
VALUES
(1, 'ヒットラーの復活', 1, 2800, 1),
(2, 'キングスフィールド', 1, 800, 2),
(3, 'ソルスティス', 1, 1800, 1),
(4, 'Noita', 2, 2200, 4),
(5, 'トルネコの大冒険2', 2, 1200, 2),
(6, 'グラディウスデラックスパック', 2, 3200, 2),
(7, 'バトルガレッガ', 3, 13600, 3),
(8, 'ザナック', NULL, 2200, 1),
(9, 'バベルの塔', NULL, 700, 1),
(10, 'ソロモンの鍵', NULL, 1200, 1);



CREATE DATABASE games_app
DEFAULT CHARACTER SET utf8

CREATE TABLE 'categories' (
  'id' int(11) PRIMARY KEY AUTO_INCREMENT,
  'category' varchar(10) NOT NULL
);

INSERT INTO 'categories' ('id', 'category')
VALUES
(1, 'アクションゲーム'),
(2, 'ローグライトゲーム'),
(3, 'シューティングゲーム'),
(4, 'パズルゲーム');


INSERT INTO `games` (`id`, `title`, `cat_id`, `price`, `type`)
VALUES
(1, 'ヒットラーの復活', 1, 2800),
(2, 'キングスフィールド', 1, 800),
(3, 'ソルスティス', 1, 1800),
(4, 'Noita', 2, 2200),
(5, 'トルネコの大冒険2', 2, 1200),
(6, 'グラディウスデラックスパック', 2, 3200),
(7, 'バトルガレッガ', 3, 13600),
(8, 'ザナック', NULL, 2200),
(9, 'バベルの塔', NULL, 700),
(10, 'ソロモンの鍵', NULL, 1200);