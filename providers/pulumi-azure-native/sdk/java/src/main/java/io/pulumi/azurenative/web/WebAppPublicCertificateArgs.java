// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.PublicCertificateLocation;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppPublicCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppPublicCertificateArgs Empty = new WebAppPublicCertificateArgs();

    /**
     * Public Certificate byte array
     * 
     */
    @InputImport(name="blob")
    private final @Nullable Input<String> blob;

    public Input<String> getBlob() {
        return this.blob == null ? Input.empty() : this.blob;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Public Certificate Location
     * 
     */
    @InputImport(name="publicCertificateLocation")
    private final @Nullable Input<PublicCertificateLocation> publicCertificateLocation;

    public Input<PublicCertificateLocation> getPublicCertificateLocation() {
        return this.publicCertificateLocation == null ? Input.empty() : this.publicCertificateLocation;
    }

    /**
     * Public certificate name.
     * 
     */
    @InputImport(name="publicCertificateName")
    private final @Nullable Input<String> publicCertificateName;

    public Input<String> getPublicCertificateName() {
        return this.publicCertificateName == null ? Input.empty() : this.publicCertificateName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public WebAppPublicCertificateArgs(
        @Nullable Input<String> blob,
        @Nullable Input<String> kind,
        Input<String> name,
        @Nullable Input<PublicCertificateLocation> publicCertificateLocation,
        @Nullable Input<String> publicCertificateName,
        Input<String> resourceGroupName) {
        this.blob = blob;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicCertificateLocation = publicCertificateLocation;
        this.publicCertificateName = publicCertificateName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppPublicCertificateArgs() {
        this.blob = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.publicCertificateLocation = Input.empty();
        this.publicCertificateName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppPublicCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blob;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private @Nullable Input<PublicCertificateLocation> publicCertificateLocation;
        private @Nullable Input<String> publicCertificateName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppPublicCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicCertificateLocation = defaults.publicCertificateLocation;
    	      this.publicCertificateName = defaults.publicCertificateName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setBlob(@Nullable Input<String> blob) {
            this.blob = blob;
            return this;
        }

        public Builder setBlob(@Nullable String blob) {
            this.blob = Input.ofNullable(blob);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPublicCertificateLocation(@Nullable Input<PublicCertificateLocation> publicCertificateLocation) {
            this.publicCertificateLocation = publicCertificateLocation;
            return this;
        }

        public Builder setPublicCertificateLocation(@Nullable PublicCertificateLocation publicCertificateLocation) {
            this.publicCertificateLocation = Input.ofNullable(publicCertificateLocation);
            return this;
        }

        public Builder setPublicCertificateName(@Nullable Input<String> publicCertificateName) {
            this.publicCertificateName = publicCertificateName;
            return this;
        }

        public Builder setPublicCertificateName(@Nullable String publicCertificateName) {
            this.publicCertificateName = Input.ofNullable(publicCertificateName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public WebAppPublicCertificateArgs build() {
            return new WebAppPublicCertificateArgs(blob, kind, name, publicCertificateLocation, publicCertificateName, resourceGroupName);
        }
    }
}
