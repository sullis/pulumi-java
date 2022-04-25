// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The original source of the content item, where it comes from.
 * 
 */
public final class MetadataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataSourceResponse Empty = new MetadataSourceResponse();

    /**
     * Source type of the content
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return Source type of the content
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    @Import(name="sourceId")
    private @Nullable String sourceId;

    /**
     * @return ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    public Optional<String> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    private MetadataSourceResponse() {}

    private MetadataSourceResponse(MetadataSourceResponse $) {
        this.kind = $.kind;
        this.name = $.name;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataSourceResponse $;

        public Builder() {
            $ = new MetadataSourceResponse();
        }

        public Builder(MetadataSourceResponse defaults) {
            $ = new MetadataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Source type of the content
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name Name of the content source.  The repo name, solution name, LA workspace name etc.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param sourceId ID of the content source.  The solution ID, workspace ID, etc
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public MetadataSourceResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
