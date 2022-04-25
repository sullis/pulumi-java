// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.TarReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Binary read settings.
 * 
 */
public final class BinaryReadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final BinaryReadSettingsResponse Empty = new BinaryReadSettingsResponse();

    /**
     * Compression settings.
     * 
     */
    @Import(name="compressionProperties")
    private @Nullable Object compressionProperties;

    /**
     * @return Compression settings.
     * 
     */
    public Optional<Object> compressionProperties() {
        return Optional.ofNullable(this.compressionProperties);
    }

    /**
     * The read setting type.
     * Expected value is &#39;BinaryReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The read setting type.
     * Expected value is &#39;BinaryReadSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private BinaryReadSettingsResponse() {}

    private BinaryReadSettingsResponse(BinaryReadSettingsResponse $) {
        this.compressionProperties = $.compressionProperties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BinaryReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BinaryReadSettingsResponse $;

        public Builder() {
            $ = new BinaryReadSettingsResponse();
        }

        public Builder(BinaryReadSettingsResponse defaults) {
            $ = new BinaryReadSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param compressionProperties Compression settings.
         * 
         * @return builder
         * 
         */
        public Builder compressionProperties(@Nullable Object compressionProperties) {
            $.compressionProperties = compressionProperties;
            return this;
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;BinaryReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public BinaryReadSettingsResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
