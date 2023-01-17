package com.example.listofwebsite

import android.net.Uri

object Server {

    fun getView(): List<Any> = listOf(
        GroupData("Новости"),
        SiteData("https://avatars.mds.yandex.net/i?id=66b1d01ba2eced02ab8ebb8dd7121b1a-5434194-images-thumbs&n=13","Тутбай", Uri.parse("http://tut.by")),
        SiteData("https://avatars.mds.yandex.net/i?id=7e5fa6b18887beb9ce3a1e4ecf65c8da-5235303-images-thumbs&n=13","Онлайнер", Uri.parse("https://www.onliner.by")),
        SiteData("https://avatars.mds.yandex.net/i?id=1641d1a5b6ed55ccdc498d06b0f6b08a-3948822-images-thumbs&n=13","ВсеСМИ", Uri.parse("https://vsesmi.online")),
        GroupData("Социальные сети"),
        SiteData("https://avatars.mds.yandex.net/i?id=e13e80f4ecf5239be89fce8e18785f5a_sr-5344516-images-thumbs&n=13","Вконтакте", Uri.parse("https://vk.com")),
        SiteData("https://avatars.mds.yandex.net/i?id=025534677b66f3ef7e7c439854db1cd4-4958745-images-thumbs&n=13","Линкедин", Uri.parse("https://www.linkedin.com")),
        SiteData("https://avatars.mds.yandex.net/i?id=c9405461da20bb4f1295004f493f8e20_sr-4607687-images-thumbs&n=13","Редит", Uri.parse("https://www.reddit.com")),
        GroupData("Фильмы"),
        SiteData("https://avatars.mds.yandex.net/i?id=77ba78317139ea36ff464d05a56a52f4_sr-3931230-images-thumbs&n=13","Кинопоиск", Uri.parse("hd.kinopoisk.ru")),
        SiteData("https://avatars.mds.yandex.net/i?id=b276ed26f95ea5ec13982c5fb50fed4d19e65e26-8219140-images-thumbs&n=13","ИВИ", Uri.parse("https://www.ivi.ru/movies")),
        SiteData("https://avatars.mds.yandex.net/i?id=34cf9ffd55e9c3bc014e502553fe0d8b_sr-5663261-images-thumbs&n=13","Вока", Uri.parse("https://voka.tv/ru-RU/movies")),
        GroupData("Другие"),
        SiteData("https://avatars.mds.yandex.net/i?id=5f53c6314164b44b68fd0a755b0cc798_sr-5236397-images-thumbs&n=13","Твич", Uri.parse("https://www.twitch.tv")),
        SiteData("https://avatars.mds.yandex.net/i?id=7897503cc1bb89a5ee3bb2908854490e-5447622-images-thumbs&n=13","Пинтерест", Uri.parse("https://ru.pinterest.com")),
        SiteData("https://avatars.mds.yandex.net/i?id=b62952850c384a746a99530f26e6e68b_sr-5869193-images-thumbs&n=13","Ютуб", Uri.parse("https://www.youtube.com")),
    )
}