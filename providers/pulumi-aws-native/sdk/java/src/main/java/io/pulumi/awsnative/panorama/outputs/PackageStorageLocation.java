// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PackageStorageLocation {
    private final @Nullable String binaryPrefixLocation;
    private final @Nullable String bucket;
    private final @Nullable String generatedPrefixLocation;
    private final @Nullable String manifestPrefixLocation;
    private final @Nullable String repoPrefixLocation;

    @CustomType.Constructor
    private PackageStorageLocation(
        @CustomType.Parameter("binaryPrefixLocation") @Nullable String binaryPrefixLocation,
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("generatedPrefixLocation") @Nullable String generatedPrefixLocation,
        @CustomType.Parameter("manifestPrefixLocation") @Nullable String manifestPrefixLocation,
        @CustomType.Parameter("repoPrefixLocation") @Nullable String repoPrefixLocation) {
        this.binaryPrefixLocation = binaryPrefixLocation;
        this.bucket = bucket;
        this.generatedPrefixLocation = generatedPrefixLocation;
        this.manifestPrefixLocation = manifestPrefixLocation;
        this.repoPrefixLocation = repoPrefixLocation;
    }

    public Optional<String> binaryPrefixLocation() {
        return Optional.ofNullable(this.binaryPrefixLocation);
    }
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    public Optional<String> generatedPrefixLocation() {
        return Optional.ofNullable(this.generatedPrefixLocation);
    }
    public Optional<String> manifestPrefixLocation() {
        return Optional.ofNullable(this.manifestPrefixLocation);
    }
    public Optional<String> repoPrefixLocation() {
        return Optional.ofNullable(this.repoPrefixLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageStorageLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String binaryPrefixLocation;
        private @Nullable String bucket;
        private @Nullable String generatedPrefixLocation;
        private @Nullable String manifestPrefixLocation;
        private @Nullable String repoPrefixLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryPrefixLocation = defaults.binaryPrefixLocation;
    	      this.bucket = defaults.bucket;
    	      this.generatedPrefixLocation = defaults.generatedPrefixLocation;
    	      this.manifestPrefixLocation = defaults.manifestPrefixLocation;
    	      this.repoPrefixLocation = defaults.repoPrefixLocation;
        }

        public Builder binaryPrefixLocation(@Nullable String binaryPrefixLocation) {
            this.binaryPrefixLocation = binaryPrefixLocation;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder generatedPrefixLocation(@Nullable String generatedPrefixLocation) {
            this.generatedPrefixLocation = generatedPrefixLocation;
            return this;
        }
        public Builder manifestPrefixLocation(@Nullable String manifestPrefixLocation) {
            this.manifestPrefixLocation = manifestPrefixLocation;
            return this;
        }
        public Builder repoPrefixLocation(@Nullable String repoPrefixLocation) {
            this.repoPrefixLocation = repoPrefixLocation;
            return this;
        }        public PackageStorageLocation build() {
            return new PackageStorageLocation(binaryPrefixLocation, bucket, generatedPrefixLocation, manifestPrefixLocation, repoPrefixLocation);
        }
    }
}
