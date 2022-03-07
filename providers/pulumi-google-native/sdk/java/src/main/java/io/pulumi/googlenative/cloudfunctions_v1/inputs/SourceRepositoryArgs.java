// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes SourceRepository, used to represent parameters related to source repository where a function is hosted.
 * 
 */
public final class SourceRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceRepositoryArgs Empty = new SourceRepositoryArgs();

    /**
     * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats: To refer to a specific commit: `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}revisions/*{@literal /}paths/*` To refer to a moveable alias (branch): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}moveable-aliases/*{@literal /}paths/*` In particular, to refer to HEAD use `master` moveable alias. To refer to a specific fixed alias (tag): `https://source.developers.google.com/projects/*{@literal /}repos/*{@literal /}fixed-aliases/*{@literal /}paths/*` You may omit `paths/*` if you want to use the main directory.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public SourceRepositoryArgs(@Nullable Input<String> url) {
        this.url = url;
    }

    private SourceRepositoryArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public SourceRepositoryArgs build() {
            return new SourceRepositoryArgs(url);
        }
    }
}