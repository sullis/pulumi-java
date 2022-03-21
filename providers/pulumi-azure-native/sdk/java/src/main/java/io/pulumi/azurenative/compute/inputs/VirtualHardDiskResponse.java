// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the uri of a disk.
 * 
 */
public final class VirtualHardDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualHardDiskResponse Empty = new VirtualHardDiskResponse();

    /**
     * Specifies the virtual hard disk's uri.
     * 
     */
    @Import(name="uri")
      private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public VirtualHardDiskResponse(@Nullable String uri) {
        this.uri = uri;
    }

    private VirtualHardDiskResponse() {
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHardDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHardDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public VirtualHardDiskResponse build() {
            return new VirtualHardDiskResponse(uri);
        }
    }
}
