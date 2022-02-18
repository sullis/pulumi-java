// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * Unique alias ID
     * 
     */
    @InputImport(name="aliasId", required=true)
    private final String aliasId;

    public String getAliasId() {
        return this.aliasId;
    }

    public GetAliasArgs(String aliasId) {
        this.aliasId = Objects.requireNonNull(aliasId, "expected parameter 'aliasId' to be non-null");
    }

    private GetAliasArgs() {
        this.aliasId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasId = defaults.aliasId;
        }

        public Builder setAliasId(String aliasId) {
            this.aliasId = Objects.requireNonNull(aliasId);
            return this;
        }

        public GetAliasArgs build() {
            return new GetAliasArgs(aliasId);
        }
    }
}
