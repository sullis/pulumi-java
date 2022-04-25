// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The RosettaNet ProcessConfiguration business document settings.
 * 
 */
public final class RosettaNetPipBusinessDocumentResponse extends com.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipBusinessDocumentResponse Empty = new RosettaNetPipBusinessDocumentResponse();

    /**
     * The business document description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The business document description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The business document name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The business document name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The business document version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The business document version.
     * 
     */
    public String version() {
        return this.version;
    }

    private RosettaNetPipBusinessDocumentResponse() {}

    private RosettaNetPipBusinessDocumentResponse(RosettaNetPipBusinessDocumentResponse $) {
        this.description = $.description;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RosettaNetPipBusinessDocumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipBusinessDocumentResponse $;

        public Builder() {
            $ = new RosettaNetPipBusinessDocumentResponse();
        }

        public Builder(RosettaNetPipBusinessDocumentResponse defaults) {
            $ = new RosettaNetPipBusinessDocumentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The business document description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param name The business document name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param version The business document version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public RosettaNetPipBusinessDocumentResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
