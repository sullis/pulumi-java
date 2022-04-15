// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionFixedResponse {
    /**
     * Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    private final String contentType;
    /**
     * Message body.
     * 
     */
    private final @Nullable String messageBody;
    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    private final @Nullable String statusCode;

    @CustomType.Constructor
    private ListenerDefaultActionFixedResponse(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("messageBody") @Nullable String messageBody,
        @CustomType.Parameter("statusCode") @Nullable String statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    /**
     * Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
    */
    public String contentType() {
        return this.contentType;
    }
    /**
     * Message body.
     * 
    */
    public Optional<String> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
    */
    public Optional<String> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionFixedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private @Nullable String messageBody;
        private @Nullable String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }        public ListenerDefaultActionFixedResponse build() {
            return new ListenerDefaultActionFixedResponse(contentType, messageBody, statusCode);
        }
    }
}
