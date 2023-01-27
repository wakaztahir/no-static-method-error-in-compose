package com.wakaztahir.sketchable

import dev.icerock.moko.resources.AssetResource
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FileResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.PluralsResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.StringResource

internal expect object Res {
  internal object strings : ResourceContainer<StringResource> {
    public val app_name: StringResource

    public val admob_app_id: StringResource

    public val interstial_id: StringResource

    public val cancel: StringResource

    public val confirm: StringResource

    public val delete: StringResource

    public val delete_layer: StringResource

    public val rename_layer: StringResource

    public val delete_confirm_msg: StringResource

    public val drag_icon: StringResource

    public val layers: StringResource

    public val color_picker_icon: StringResource

    public val round_brush: StringResource

    public val search: StringResource

    public val save_exit: StringResource

    public val save_exit_msg: StringResource

    public val create_tag: StringResource

    public val update_tag: StringResource

    public val edit_tag: StringResource

    public val no_tags_matching: StringResource

    public val all: StringResource

    public val export_sketchables: StringResource

    public val import_sketchables: StringResource

    public val no_file_selected: StringResource

    public val sketchable_import_msg: StringResource

    public val export_sketchable_msg: StringResource

    public val export_png: StringResource

    public val export_pdf: StringResource

    public val out_of_memory: StringResource

    public val couldnt_create_file: StringResource

    public val selected_file_invalid: StringResource

    public val unknown_error: StringResource

    public val exporting_sketchable: StringResource

    public val export: StringResource

    public val importing_sketchable: StringResource

    public val importi: StringResource

    public val scale: StringResource

    public val view: StringResource

    public val remove_ads: StringResource
  }

  internal object plurals : ResourceContainer<PluralsResource>

  internal object images : ResourceContainer<ImageResource>

  internal object fonts : ResourceContainer<FontResource>

  internal object files : ResourceContainer<FileResource>

  internal object colors : ResourceContainer<ColorResource>

  internal object assets : ResourceContainer<AssetResource>
}
