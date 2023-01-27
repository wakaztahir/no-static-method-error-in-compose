package com.wakaztahir.sketchable

import dev.icerock.moko.graphics.Color
import dev.icerock.moko.resources.AssetResource
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FileResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.PluralsResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.StringResource
import java.lang.ClassLoader
import kotlin.String

internal actual object Res {
  private val stringsBundle: String = "localization/comwakaztahirsketchable_mokoBundle"

  private val pluralsBundle: String = "localization/comwakaztahirsketchable_mokoPluralsBundle"

  internal actual object strings : ResourceContainer<StringResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader

    public actual val app_name: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "app_name")

    public actual val admob_app_id: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "admob_app_id")

    public actual val interstial_id: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "interstial_id")

    public actual val cancel: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "cancel")

    public actual val confirm: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "confirm")

    public actual val delete: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "delete")

    public actual val delete_layer: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "delete_layer")

    public actual val rename_layer: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "rename_layer")

    public actual val delete_confirm_msg: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "delete_confirm_msg")

    public actual val drag_icon: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "drag_icon")

    public actual val layers: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "layers")

    public actual val color_picker_icon: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "color_picker_icon")

    public actual val round_brush: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "round_brush")

    public actual val search: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "search")

    public actual val save_exit: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "save_exit")

    public actual val save_exit_msg: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "save_exit_msg")

    public actual val create_tag: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "create_tag")

    public actual val update_tag: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "update_tag")

    public actual val edit_tag: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "edit_tag")

    public actual val no_tags_matching: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "no_tags_matching")

    public actual val all: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "all")

    public actual val export_sketchables: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "export_sketchables")

    public actual val import_sketchables: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "import_sketchables")

    public actual val no_file_selected: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "no_file_selected")

    public actual val sketchable_import_msg: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "sketchable_import_msg")

    public actual val export_sketchable_msg: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "export_sketchable_msg")

    public actual val export_png: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "export_png")

    public actual val export_pdf: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "export_pdf")

    public actual val out_of_memory: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "out_of_memory")

    public actual val couldnt_create_file: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "couldnt_create_file")

    public actual val selected_file_invalid: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "selected_file_invalid")

    public actual val unknown_error: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "unknown_error")

    public actual val exporting_sketchable: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "exporting_sketchable")

    public actual val export: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "export")

    public actual val importing_sketchable: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "importing_sketchable")

    public actual val importi: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "importi")

    public actual val scale: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "scale")

    public actual val view: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "view")

    public actual val remove_ads: StringResource = StringResource(resourcesClassLoader =
        resourcesClassLoader, bundleName = stringsBundle, key = "remove_ads")
  }

  internal actual object plurals : ResourceContainer<PluralsResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }

  internal actual object images : ResourceContainer<ImageResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }

  internal actual object fonts : ResourceContainer<FontResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }

  internal actual object files : ResourceContainer<FileResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }

  internal actual object colors : ResourceContainer<ColorResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }

  internal actual object assets : ResourceContainer<AssetResource> {
    public override val resourcesClassLoader: ClassLoader = Res::class.java.classLoader
  }
}
