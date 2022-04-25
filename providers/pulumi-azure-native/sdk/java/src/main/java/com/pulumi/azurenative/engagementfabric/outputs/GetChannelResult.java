// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetChannelResult {
    /**
     * @return The functions to be enabled for the channel
     * 
     */
    private final @Nullable List<String> channelFunctions;
    /**
     * @return The channel type
     * 
     */
    private final String channelType;
    /**
     * @return The channel credentials
     * 
     */
    private final @Nullable Map<String,String> credentials;
    /**
     * @return The ID of the resource
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The fully qualified type of the resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetChannelResult(
        @CustomType.Parameter("channelFunctions") @Nullable List<String> channelFunctions,
        @CustomType.Parameter("channelType") String channelType,
        @CustomType.Parameter("credentials") @Nullable Map<String,String> credentials,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.channelFunctions = channelFunctions;
        this.channelType = channelType;
        this.credentials = credentials;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The functions to be enabled for the channel
     * 
     */
    public List<String> channelFunctions() {
        return this.channelFunctions == null ? List.of() : this.channelFunctions;
    }
    /**
     * @return The channel type
     * 
     */
    public String channelType() {
        return this.channelType;
    }
    /**
     * @return The channel credentials
     * 
     */
    public Map<String,String> credentials() {
        return this.credentials == null ? Map.of() : this.credentials;
    }
    /**
     * @return The ID of the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The fully qualified type of the resource
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> channelFunctions;
        private String channelType;
        private @Nullable Map<String,String> credentials;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelFunctions = defaults.channelFunctions;
    	      this.channelType = defaults.channelType;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder channelFunctions(@Nullable List<String> channelFunctions) {
            this.channelFunctions = channelFunctions;
            return this;
        }
        public Builder channelFunctions(String... channelFunctions) {
            return channelFunctions(List.of(channelFunctions));
        }
        public Builder channelType(String channelType) {
            this.channelType = Objects.requireNonNull(channelType);
            return this;
        }
        public Builder credentials(@Nullable Map<String,String> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetChannelResult build() {
            return new GetChannelResult(channelFunctions, channelType, credentials, id, name, type);
        }
    }
}
