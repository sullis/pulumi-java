// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a built-in preset for encoding the input video with the Standard Encoder.
 * 
 */
public final class BuiltInStandardEncoderPresetResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuiltInStandardEncoderPresetResponse Empty = new BuiltInStandardEncoderPresetResponse();

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.BuiltInStandardEncoderPreset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.BuiltInStandardEncoderPreset&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * The built-in preset to be used for encoding videos.
     * 
     */
    @Import(name="presetName", required=true)
    private String presetName;

    /**
     * @return The built-in preset to be used for encoding videos.
     * 
     */
    public String presetName() {
        return this.presetName;
    }

    private BuiltInStandardEncoderPresetResponse() {}

    private BuiltInStandardEncoderPresetResponse(BuiltInStandardEncoderPresetResponse $) {
        this.odataType = $.odataType;
        this.presetName = $.presetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuiltInStandardEncoderPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuiltInStandardEncoderPresetResponse $;

        public Builder() {
            $ = new BuiltInStandardEncoderPresetResponse();
        }

        public Builder(BuiltInStandardEncoderPresetResponse defaults) {
            $ = new BuiltInStandardEncoderPresetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.BuiltInStandardEncoderPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param presetName The built-in preset to be used for encoding videos.
         * 
         * @return builder
         * 
         */
        public Builder presetName(String presetName) {
            $.presetName = presetName;
            return this;
        }

        public BuiltInStandardEncoderPresetResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            $.presetName = Objects.requireNonNull($.presetName, "expected parameter 'presetName' to be non-null");
            return $;
        }
    }

}
