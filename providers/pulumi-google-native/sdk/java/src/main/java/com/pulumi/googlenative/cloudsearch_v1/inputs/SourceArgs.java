// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.enums.SourcePredefinedSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines sources for the suggest/search APIs.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * Source name for content indexed by the Indexing API.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Source name for content indexed by the Indexing API.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Predefined content source for Google Apps.
     * 
     */
    @Import(name="predefinedSource")
    private @Nullable Output<SourcePredefinedSource> predefinedSource;

    /**
     * @return Predefined content source for Google Apps.
     * 
     */
    public Optional<Output<SourcePredefinedSource>> predefinedSource() {
        return Optional.ofNullable(this.predefinedSource);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.name = $.name;
        this.predefinedSource = $.predefinedSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Source name for content indexed by the Indexing API.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Source name for content indexed by the Indexing API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param predefinedSource Predefined content source for Google Apps.
         * 
         * @return builder
         * 
         */
        public Builder predefinedSource(@Nullable Output<SourcePredefinedSource> predefinedSource) {
            $.predefinedSource = predefinedSource;
            return this;
        }

        /**
         * @param predefinedSource Predefined content source for Google Apps.
         * 
         * @return builder
         * 
         */
        public Builder predefinedSource(SourcePredefinedSource predefinedSource) {
            return predefinedSource(Output.of(predefinedSource));
        }

        public SourceArgs build() {
            return $;
        }
    }

}
