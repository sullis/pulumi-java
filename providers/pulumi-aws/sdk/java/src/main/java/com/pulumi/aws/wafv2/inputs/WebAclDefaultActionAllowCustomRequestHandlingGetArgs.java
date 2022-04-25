// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclDefaultActionAllowCustomRequestHandlingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionAllowCustomRequestHandlingGetArgs Empty = new WebAclDefaultActionAllowCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
    private Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders() {
        return this.insertHeaders;
    }

    private WebAclDefaultActionAllowCustomRequestHandlingGetArgs() {}

    private WebAclDefaultActionAllowCustomRequestHandlingGetArgs(WebAclDefaultActionAllowCustomRequestHandlingGetArgs $) {
        this.insertHeaders = $.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclDefaultActionAllowCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclDefaultActionAllowCustomRequestHandlingGetArgs $;

        public Builder() {
            $ = new WebAclDefaultActionAllowCustomRequestHandlingGetArgs();
        }

        public Builder(WebAclDefaultActionAllowCustomRequestHandlingGetArgs defaults) {
            $ = new WebAclDefaultActionAllowCustomRequestHandlingGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            $.insertHeaders = insertHeaders;
            return this;
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            return insertHeaders(Output.of(insertHeaders));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderGetArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }

        public WebAclDefaultActionAllowCustomRequestHandlingGetArgs build() {
            $.insertHeaders = Objects.requireNonNull($.insertHeaders, "expected parameter 'insertHeaders' to be non-null");
            return $;
        }
    }

}
