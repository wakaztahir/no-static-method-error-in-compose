package com.wakaztahir.sketchable

import com.wakaztahir.sketchable.R
import dev.icerock.moko.graphics.Color
import dev.icerock.moko.resources.AssetResource
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FileResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.PluralsResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.StringResource

internal actual object Res {
  internal actual object strings : ResourceContainer<StringResource> {
    public actual val app_name: StringResource = StringResource(R.string.app_name)

    public actual val admob_app_id: StringResource = StringResource(R.string.admob_app_id)

    public actual val interstial_id: StringResource = StringResource(R.string.interstial_id)

    public actual val cancel: StringResource = StringResource(R.string.cancel)

    public actual val confirm: StringResource = StringResource(R.string.confirm)

    public actual val delete: StringResource = StringResource(R.string.delete)

    public actual val delete_layer: StringResource = StringResource(R.string.delete_layer)

    public actual val rename_layer: StringResource = StringResource(R.string.rename_layer)

    public actual val delete_confirm_msg: StringResource =
        StringResource(R.string.delete_confirm_msg)

    public actual val drag_icon: StringResource = StringResource(R.string.drag_icon)

    public actual val layers: StringResource = StringResource(R.string.layers)

    public actual val color_picker_icon: StringResource = StringResource(R.string.color_picker_icon)

    public actual val round_brush: StringResource = StringResource(R.string.round_brush)

    public actual val search: StringResource = StringResource(R.string.search)

    public actual val save_exit: StringResource = StringResource(R.string.save_exit)

    public actual val save_exit_msg: StringResource = StringResource(R.string.save_exit_msg)

    public actual val create_tag: StringResource = StringResource(R.string.create_tag)

    public actual val update_tag: StringResource = StringResource(R.string.update_tag)

    public actual val edit_tag: StringResource = StringResource(R.string.edit_tag)

    public actual val no_tags_matching: StringResource = StringResource(R.string.no_tags_matching)

    public actual val all: StringResource = StringResource(R.string.all)

    public actual val export_sketchables: StringResource =
        StringResource(R.string.export_sketchables)

    public actual val import_sketchables: StringResource =
        StringResource(R.string.import_sketchables)

    public actual val no_file_selected: StringResource = StringResource(R.string.no_file_selected)

    public actual val sketchable_import_msg: StringResource =
        StringResource(R.string.sketchable_import_msg)

    public actual val export_sketchable_msg: StringResource =
        StringResource(R.string.export_sketchable_msg)

    public actual val export_png: StringResource = StringResource(R.string.export_png)

    public actual val export_pdf: StringResource = StringResource(R.string.export_pdf)

    public actual val out_of_memory: StringResource = StringResource(R.string.out_of_memory)

    public actual val couldnt_create_file: StringResource =
        StringResource(R.string.couldnt_create_file)

    public actual val selected_file_invalid: StringResource =
        StringResource(R.string.selected_file_invalid)

    public actual val unknown_error: StringResource = StringResource(R.string.unknown_error)

    public actual val exporting_sketchable: StringResource =
        StringResource(R.string.exporting_sketchable)

    public actual val export: StringResource = StringResource(R.string.export)

    public actual val importing_sketchable: StringResource =
        StringResource(R.string.importing_sketchable)

    public actual val importi: StringResource = StringResource(R.string.importi)

    public actual val scale: StringResource = StringResource(R.string.scale)

    public actual val view: StringResource = StringResource(R.string.view)

    public actual val remove_ads: StringResource = StringResource(R.string.remove_ads)
  }

  internal actual object plurals : ResourceContainer<PluralsResource>

  internal actual object images : ResourceContainer<ImageResource>

  internal actual object fonts : ResourceContainer<FontResource>

  internal actual object files : ResourceContainer<FileResource>

  internal actual object colors : ResourceContainer<ColorResource>

  internal actual object assets : ResourceContainer<AssetResource>
}
