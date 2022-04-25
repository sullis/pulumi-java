// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.AKSResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.AmlComputeResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.DataFactoryResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.DataLakeAnalyticsResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.DatabricksResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.HDInsightResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.VirtualMachineResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMachineLearningComputeResult {
    /**
     * @return Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * @return Compute properties
     * 
     */
    private final Object properties;
    /**
     * @return The sku of the workspace.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Specifies the type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMachineLearningComputeResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Object properties,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Specifies the resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Specifies the name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Compute properties
     * 
     */
    public Object properties() {
        return this.properties;
    }
    /**
     * @return The sku of the workspace.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Specifies the type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineLearningComputeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private Object properties;
        private @Nullable SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineLearningComputeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetMachineLearningComputeResult build() {
            return new GetMachineLearningComputeResult(id, identity, location, name, properties, sku, systemData, tags, type);
        }
    }
}
