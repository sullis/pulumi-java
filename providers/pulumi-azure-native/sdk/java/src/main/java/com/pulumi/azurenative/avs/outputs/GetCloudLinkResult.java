// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudLinkResult {
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Identifier of the other private cloud participating in the link.
     * 
     */
    private final @Nullable String linkedCloud;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The state of the cloud link.
     * 
     */
    private final String status;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCloudLinkResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedCloud") @Nullable String linkedCloud,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.linkedCloud = linkedCloud;
        this.name = name;
        this.status = status;
        this.type = type;
    }

    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the other private cloud participating in the link.
     * 
     */
    public Optional<String> linkedCloud() {
        return Optional.ofNullable(this.linkedCloud);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The state of the cloud link.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String linkedCloud;
        private String name;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedCloud = defaults.linkedCloud;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder linkedCloud(@Nullable String linkedCloud) {
            this.linkedCloud = linkedCloud;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCloudLinkResult build() {
            return new GetCloudLinkResult(id, linkedCloud, name, status, type);
        }
    }
}
