// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 * 
 */
public final class GoogleRpcStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleRpcStatusResponse Empty = new GoogleRpcStatusResponse();

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    @Import(name="code", required=true)
    private Integer code;

    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Integer code() {
        return this.code;
    }

    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    @Import(name="details", required=true)
    private List<Map<String,String>> details;

    /**
     * @return A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    public List<Map<String,String>> details() {
        return this.details;
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    public String message() {
        return this.message;
    }

    private GoogleRpcStatusResponse() {}

    private GoogleRpcStatusResponse(GoogleRpcStatusResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleRpcStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusResponse $;

        public Builder() {
            $ = new GoogleRpcStatusResponse();
        }

        public Builder(GoogleRpcStatusResponse defaults) {
            $ = new GoogleRpcStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The status code, which should be an enum value of google.rpc.Code.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            $.code = code;
            return this;
        }

        /**
         * @param details A list of messages that carry the error details. There is a common set of message types for APIs to use.
         * 
         * @return builder
         * 
         */
        public Builder details(List<Map<String,String>> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details A list of messages that carry the error details. There is a common set of message types for APIs to use.
         * 
         * @return builder
         * 
         */
        public Builder details(Map<String,String>... details) {
            return details(List.of(details));
        }

        /**
         * @param message A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public GoogleRpcStatusResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
