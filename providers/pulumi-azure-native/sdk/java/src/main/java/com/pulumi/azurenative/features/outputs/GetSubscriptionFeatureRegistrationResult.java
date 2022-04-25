// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features.outputs;

import com.pulumi.azurenative.features.outputs.SubscriptionFeatureRegistrationResponseProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionFeatureRegistrationResult {
    /**
     * @return Azure resource Id.
     * 
     */
    private final String id;
    /**
     * @return Azure resource name.
     * 
     */
    private final String name;
    private final SubscriptionFeatureRegistrationResponseProperties properties;
    /**
     * @return Azure resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSubscriptionFeatureRegistrationResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") SubscriptionFeatureRegistrationResponseProperties properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return Azure resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Azure resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    public SubscriptionFeatureRegistrationResponseProperties properties() {
        return this.properties;
    }
    /**
     * @return Azure resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionFeatureRegistrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private SubscriptionFeatureRegistrationResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionFeatureRegistrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(SubscriptionFeatureRegistrationResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSubscriptionFeatureRegistrationResult build() {
            return new GetSubscriptionFeatureRegistrationResult(id, name, properties, type);
        }
    }
}
