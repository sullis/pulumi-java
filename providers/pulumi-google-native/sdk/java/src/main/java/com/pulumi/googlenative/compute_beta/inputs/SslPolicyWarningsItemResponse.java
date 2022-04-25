// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.SslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SslPolicyWarningsItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final SslPolicyWarningsItemResponse Empty = new SslPolicyWarningsItemResponse();

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    @Import(name="data", required=true)
    private List<SslPolicyWarningsItemDataItemResponse> data;

    /**
     * @return Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    public List<SslPolicyWarningsItemDataItemResponse> data() {
        return this.data;
    }

    /**
     * A human-readable description of the warning code.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return A human-readable description of the warning code.
     * 
     */
    public String message() {
        return this.message;
    }

    private SslPolicyWarningsItemResponse() {}

    private SslPolicyWarningsItemResponse(SslPolicyWarningsItemResponse $) {
        this.code = $.code;
        this.data = $.data;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslPolicyWarningsItemResponse $;

        public Builder() {
            $ = new SslPolicyWarningsItemResponse();
        }

        public Builder(SslPolicyWarningsItemResponse defaults) {
            $ = new SslPolicyWarningsItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param data Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
         * 
         * @return builder
         * 
         */
        public Builder data(List<SslPolicyWarningsItemDataItemResponse> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
         * 
         * @return builder
         * 
         */
        public Builder data(SslPolicyWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }

        /**
         * @param message A human-readable description of the warning code.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public SslPolicyWarningsItemResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.data = Objects.requireNonNull($.data, "expected parameter 'data' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
