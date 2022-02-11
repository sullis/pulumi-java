// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleFixedResponseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleFixedResponseConfigArgs Empty = new ListenerRuleFixedResponseConfigArgs();

    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    @InputImport(name="messageBody")
    private final @Nullable Input<String> messageBody;

    public Input<String> getMessageBody() {
        return this.messageBody == null ? Input.empty() : this.messageBody;
    }

    @InputImport(name="statusCode", required=true)
    private final Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode;
    }

    public ListenerRuleFixedResponseConfigArgs(
        @Nullable Input<String> contentType,
        @Nullable Input<String> messageBody,
        Input<String> statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private ListenerRuleFixedResponseConfigArgs() {
        this.contentType = Input.empty();
        this.messageBody = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleFixedResponseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> messageBody;
        private Input<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleFixedResponseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setMessageBody(@Nullable Input<String> messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder setMessageBody(@Nullable String messageBody) {
            this.messageBody = Input.ofNullable(messageBody);
            return this;
        }

        public Builder setStatusCode(Input<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Input.of(Objects.requireNonNull(statusCode));
            return this;
        }

        public ListenerRuleFixedResponseConfigArgs build() {
            return new ListenerRuleFixedResponseConfigArgs(contentType, messageBody, statusCode);
        }
    }
}
