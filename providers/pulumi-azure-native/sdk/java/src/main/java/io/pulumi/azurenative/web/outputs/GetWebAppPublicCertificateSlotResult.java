// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPublicCertificateSlotResult {
    /**
     * Public Certificate byte array
     * 
     */
    private final @Nullable String blob;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Public Certificate Location
     * 
     */
    private final @Nullable String publicCertificateLocation;
    /**
     * Certificate Thumbprint
     * 
     */
    private final String thumbprint;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebAppPublicCertificateSlotResult(
        @CustomType.Parameter("blob") @Nullable String blob,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicCertificateLocation") @Nullable String publicCertificateLocation,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("type") String type) {
        this.blob = blob;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.publicCertificateLocation = publicCertificateLocation;
        this.thumbprint = thumbprint;
        this.type = type;
    }

    /**
     * Public Certificate byte array
     * 
    */
    public Optional<String> getBlob() {
        return Optional.ofNullable(this.blob);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Public Certificate Location
     * 
    */
    public Optional<String> getPublicCertificateLocation() {
        return Optional.ofNullable(this.publicCertificateLocation);
    }
    /**
     * Certificate Thumbprint
     * 
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPublicCertificateSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blob;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String publicCertificateLocation;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPublicCertificateSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicCertificateLocation = defaults.publicCertificateLocation;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder blob(@Nullable String blob) {
            this.blob = blob;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicCertificateLocation(@Nullable String publicCertificateLocation) {
            this.publicCertificateLocation = publicCertificateLocation;
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebAppPublicCertificateSlotResult build() {
            return new GetWebAppPublicCertificateSlotResult(blob, id, kind, name, publicCertificateLocation, thumbprint, type);
        }
    }
}
