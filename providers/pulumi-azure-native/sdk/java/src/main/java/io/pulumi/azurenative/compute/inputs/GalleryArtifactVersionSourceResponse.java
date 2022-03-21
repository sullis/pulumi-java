// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The gallery artifact version source.
 * 
 */
public final class GalleryArtifactVersionSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryArtifactVersionSourceResponse Empty = new GalleryArtifactVersionSourceResponse();

    /**
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    @Import(name="uri")
      private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public GalleryArtifactVersionSourceResponse(
        @Nullable String id,
        @Nullable String uri) {
        this.id = id;
        this.uri = uri;
    }

    private GalleryArtifactVersionSourceResponse() {
        this.id = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryArtifactVersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryArtifactVersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uri = defaults.uri;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public GalleryArtifactVersionSourceResponse build() {
            return new GalleryArtifactVersionSourceResponse(id, uri);
        }
    }
}
