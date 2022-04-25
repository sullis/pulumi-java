// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.outputs;

import com.pulumi.azurenative.keyvault.outputs.KeyAttributesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyResult {
    /**
     * @return The attributes of the key.
     * 
     */
    private final @Nullable KeyAttributesResponse attributes;
    /**
     * @return The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    private final @Nullable String curveName;
    /**
     * @return Fully qualified identifier of the key vault resource.
     * 
     */
    private final String id;
    private final @Nullable List<String> keyOps;
    /**
     * @return The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    private final @Nullable Integer keySize;
    /**
     * @return The URI to retrieve the current version of the key.
     * 
     */
    private final String keyUri;
    /**
     * @return The URI to retrieve the specific version of the key.
     * 
     */
    private final String keyUriWithVersion;
    /**
     * @return The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    private final @Nullable String kty;
    /**
     * @return Azure location of the key vault resource.
     * 
     */
    private final String location;
    /**
     * @return Name of the key vault resource.
     * 
     */
    private final String name;
    /**
     * @return Tags assigned to the key vault resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Resource type of the key vault resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("attributes") @Nullable KeyAttributesResponse attributes,
        @CustomType.Parameter("curveName") @Nullable String curveName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyOps") @Nullable List<String> keyOps,
        @CustomType.Parameter("keySize") @Nullable Integer keySize,
        @CustomType.Parameter("keyUri") String keyUri,
        @CustomType.Parameter("keyUriWithVersion") String keyUriWithVersion,
        @CustomType.Parameter("kty") @Nullable String kty,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.attributes = attributes;
        this.curveName = curveName;
        this.id = id;
        this.keyOps = keyOps;
        this.keySize = keySize;
        this.keyUri = keyUri;
        this.keyUriWithVersion = keyUriWithVersion;
        this.kty = kty;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The attributes of the key.
     * 
     */
    public Optional<KeyAttributesResponse> attributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * @return The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    public Optional<String> curveName() {
        return Optional.ofNullable(this.curveName);
    }
    /**
     * @return Fully qualified identifier of the key vault resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> keyOps() {
        return this.keyOps == null ? List.of() : this.keyOps;
    }
    /**
     * @return The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    public Optional<Integer> keySize() {
        return Optional.ofNullable(this.keySize);
    }
    /**
     * @return The URI to retrieve the current version of the key.
     * 
     */
    public String keyUri() {
        return this.keyUri;
    }
    /**
     * @return The URI to retrieve the specific version of the key.
     * 
     */
    public String keyUriWithVersion() {
        return this.keyUriWithVersion;
    }
    /**
     * @return The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    public Optional<String> kty() {
        return Optional.ofNullable(this.kty);
    }
    /**
     * @return Azure location of the key vault resource.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Name of the key vault resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Tags assigned to the key vault resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Resource type of the key vault resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyAttributesResponse attributes;
        private @Nullable String curveName;
        private String id;
        private @Nullable List<String> keyOps;
        private @Nullable Integer keySize;
        private String keyUri;
        private String keyUriWithVersion;
        private @Nullable String kty;
        private String location;
        private String name;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.curveName = defaults.curveName;
    	      this.id = defaults.id;
    	      this.keyOps = defaults.keyOps;
    	      this.keySize = defaults.keySize;
    	      this.keyUri = defaults.keyUri;
    	      this.keyUriWithVersion = defaults.keyUriWithVersion;
    	      this.kty = defaults.kty;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder attributes(@Nullable KeyAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder curveName(@Nullable String curveName) {
            this.curveName = curveName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyOps(@Nullable List<String> keyOps) {
            this.keyOps = keyOps;
            return this;
        }
        public Builder keyOps(String... keyOps) {
            return keyOps(List.of(keyOps));
        }
        public Builder keySize(@Nullable Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Builder keyUri(String keyUri) {
            this.keyUri = Objects.requireNonNull(keyUri);
            return this;
        }
        public Builder keyUriWithVersion(String keyUriWithVersion) {
            this.keyUriWithVersion = Objects.requireNonNull(keyUriWithVersion);
            return this;
        }
        public Builder kty(@Nullable String kty) {
            this.kty = kty;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetKeyResult build() {
            return new GetKeyResult(attributes, curveName, id, keyOps, keySize, keyUri, keyUriWithVersion, kty, location, name, tags, type);
        }
    }
}
