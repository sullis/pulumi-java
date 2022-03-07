// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetVirtualNetworkRuleResult {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The resource identifier for the subnet.
     * 
     */
    private final String subnetId;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","subnetId","type"})
    private GetVirtualNetworkRuleResult(
        String id,
        String name,
        String subnetId,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.subnetId = Objects.requireNonNull(subnetId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource identifier for the subnet.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subnetId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetVirtualNetworkRuleResult build() {
            return new GetVirtualNetworkRuleResult(id, name, subnetId, type);
        }
    }
}