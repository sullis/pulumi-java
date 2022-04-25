// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Uniformly shards test cases given a total number of shards. For Instrumentation test, it will be translated to &#34;-e numShard&#34; &#34;-e shardIndex&#34; AndroidJUnitRunner arguments. With uniform sharding enabled, specifying these sharding arguments via environment_variables is invalid.
 * 
 */
public final class UniformShardingResponse extends com.pulumi.resources.InvokeArgs {

    public static final UniformShardingResponse Empty = new UniformShardingResponse();

    /**
     * Total number of shards. When any physical devices are selected, the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    @Import(name="numShards", required=true)
    private Integer numShards;

    /**
     * @return Total number of shards. When any physical devices are selected, the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }

    private UniformShardingResponse() {}

    private UniformShardingResponse(UniformShardingResponse $) {
        this.numShards = $.numShards;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UniformShardingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UniformShardingResponse $;

        public Builder() {
            $ = new UniformShardingResponse();
        }

        public Builder(UniformShardingResponse defaults) {
            $ = new UniformShardingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param numShards Total number of shards. When any physical devices are selected, the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
         * 
         * @return builder
         * 
         */
        public Builder numShards(Integer numShards) {
            $.numShards = numShards;
            return this;
        }

        public UniformShardingResponse build() {
            $.numShards = Objects.requireNonNull($.numShards, "expected parameter 'numShards' to be non-null");
            return $;
        }
    }

}
