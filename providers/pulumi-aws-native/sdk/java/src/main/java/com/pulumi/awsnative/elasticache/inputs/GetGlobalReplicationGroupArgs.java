// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalReplicationGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalReplicationGroupArgs Empty = new GetGlobalReplicationGroupArgs();

    /**
     * The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    @Import(name="globalReplicationGroupId", required=true)
    private Output<String> globalReplicationGroupId;

    /**
     * @return The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    public Output<String> globalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    private GetGlobalReplicationGroupArgs() {}

    private GetGlobalReplicationGroupArgs(GetGlobalReplicationGroupArgs $) {
        this.globalReplicationGroupId = $.globalReplicationGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalReplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalReplicationGroupArgs $;

        public Builder() {
            $ = new GetGlobalReplicationGroupArgs();
        }

        public Builder(GetGlobalReplicationGroupArgs defaults) {
            $ = new GetGlobalReplicationGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalReplicationGroupId The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(Output<String> globalReplicationGroupId) {
            $.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }

        /**
         * @param globalReplicationGroupId The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(String globalReplicationGroupId) {
            return globalReplicationGroupId(Output.of(globalReplicationGroupId));
        }

        public GetGlobalReplicationGroupArgs build() {
            $.globalReplicationGroupId = Objects.requireNonNull($.globalReplicationGroupId, "expected parameter 'globalReplicationGroupId' to be non-null");
            return $;
        }
    }

}
