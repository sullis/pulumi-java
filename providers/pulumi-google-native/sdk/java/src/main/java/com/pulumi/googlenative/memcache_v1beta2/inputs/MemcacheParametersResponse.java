// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class MemcacheParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final MemcacheParametersResponse Empty = new MemcacheParametersResponse();

    /**
     * User defined set of parameters to use in the memcached process.
     * 
     */
    @Import(name="params", required=true)
    private Map<String,String> params;

    /**
     * @return User defined set of parameters to use in the memcached process.
     * 
     */
    public Map<String,String> params() {
        return this.params;
    }

    private MemcacheParametersResponse() {}

    private MemcacheParametersResponse(MemcacheParametersResponse $) {
        this.params = $.params;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MemcacheParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MemcacheParametersResponse $;

        public Builder() {
            $ = new MemcacheParametersResponse();
        }

        public Builder(MemcacheParametersResponse defaults) {
            $ = new MemcacheParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param params User defined set of parameters to use in the memcached process.
         * 
         * @return builder
         * 
         */
        public Builder params(Map<String,String> params) {
            $.params = params;
            return this;
        }

        public MemcacheParametersResponse build() {
            $.params = Objects.requireNonNull($.params, "expected parameter 'params' to be non-null");
            return $;
        }
    }

}
