// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata for any related URL information
 * 
 */
public final class RelatedUrlArgs extends io.pulumi.resources.ResourceArgs {

    public static final RelatedUrlArgs Empty = new RelatedUrlArgs();

    /**
     * Label to describe usage of the URL
     * 
     */
    @InputImport(name="label")
      private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * Specific URL to associate with the note
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public RelatedUrlArgs(
        @Nullable Input<String> label,
        @Nullable Input<String> url) {
        this.label = label;
        this.url = url;
    }

    private RelatedUrlArgs() {
        this.label = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelatedUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> label;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(RelatedUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.url = defaults.url;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public RelatedUrlArgs build() {
            return new RelatedUrlArgs(label, url);
        }
    }
}