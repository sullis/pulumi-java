// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.outputs;

import io.pulumi.awsnative.rds.outputs.DBProxyEndpointTagFormat;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDBProxyEndpointResult {
    /**
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * 
     */
    private final @Nullable String dBProxyEndpointArn;
    /**
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    private final @Nullable String endpoint;
    /**
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be either read/write or read-only.
     * 
     */
    private final @Nullable Boolean isDefault;
    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
     * 
     */
    private final @Nullable List<DBProxyEndpointTagFormat> tags;
    /**
     * VPC ID to associate with the new DB proxy endpoint.
     * 
     */
    private final @Nullable String vpcId;
    /**
     * VPC security group IDs to associate with the new DB proxy endpoint.
     * 
     */
    private final @Nullable List<String> vpcSecurityGroupIds;

    @OutputCustomType.Constructor({"dBProxyEndpointArn","endpoint","isDefault","tags","vpcId","vpcSecurityGroupIds"})
    private GetDBProxyEndpointResult(
        @Nullable String dBProxyEndpointArn,
        @Nullable String endpoint,
        @Nullable Boolean isDefault,
        @Nullable List<DBProxyEndpointTagFormat> tags,
        @Nullable String vpcId,
        @Nullable List<String> vpcSecurityGroupIds) {
        this.dBProxyEndpointArn = dBProxyEndpointArn;
        this.endpoint = endpoint;
        this.isDefault = isDefault;
        this.tags = tags;
        this.vpcId = vpcId;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    /**
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * 
    */
    public Optional<String> getDBProxyEndpointArn() {
        return Optional.ofNullable(this.dBProxyEndpointArn);
    }
    /**
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string for a database client application.
     * 
    */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be either read/write or read-only.
     * 
    */
    public Optional<Boolean> getIsDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
     * 
    */
    public List<DBProxyEndpointTagFormat> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * VPC ID to associate with the new DB proxy endpoint.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * VPC security group IDs to associate with the new DB proxy endpoint.
     * 
    */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? List.of() : this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDBProxyEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dBProxyEndpointArn;
        private @Nullable String endpoint;
        private @Nullable Boolean isDefault;
        private @Nullable List<DBProxyEndpointTagFormat> tags;
        private @Nullable String vpcId;
        private @Nullable List<String> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDBProxyEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBProxyEndpointArn = defaults.dBProxyEndpointArn;
    	      this.endpoint = defaults.endpoint;
    	      this.isDefault = defaults.isDefault;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setDBProxyEndpointArn(@Nullable String dBProxyEndpointArn) {
            this.dBProxyEndpointArn = dBProxyEndpointArn;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setIsDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder setTags(@Nullable List<DBProxyEndpointTagFormat> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public GetDBProxyEndpointResult build() {
            return new GetDBProxyEndpointResult(dBProxyEndpointArn, endpoint, isDefault, tags, vpcId, vpcSecurityGroupIds);
        }
    }
}