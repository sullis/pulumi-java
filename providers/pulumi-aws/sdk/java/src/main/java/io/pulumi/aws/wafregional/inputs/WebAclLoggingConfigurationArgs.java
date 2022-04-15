// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationArgs Empty = new WebAclLoggingConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    @Import(name="logDestination", required=true)
      private final Output<String> logDestination;

    public Output<String> logDestination() {
        return this.logDestination;
    }

    /**
     * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    @Import(name="redactedFields")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldsArgs> redactedFields;

    public Output<WebAclLoggingConfigurationRedactedFieldsArgs> redactedFields() {
        return this.redactedFields == null ? Codegen.empty() : this.redactedFields;
    }

    public WebAclLoggingConfigurationArgs(
        Output<String> logDestination,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldsArgs> redactedFields) {
        this.logDestination = Objects.requireNonNull(logDestination, "expected parameter 'logDestination' to be non-null");
        this.redactedFields = redactedFields;
    }

    private WebAclLoggingConfigurationArgs() {
        this.logDestination = Codegen.empty();
        this.redactedFields = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> logDestination;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldsArgs> redactedFields;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.redactedFields = defaults.redactedFields;
        }

        public Builder logDestination(Output<String> logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }
        public Builder logDestination(String logDestination) {
            this.logDestination = Output.of(Objects.requireNonNull(logDestination));
            return this;
        }
        public Builder redactedFields(@Nullable Output<WebAclLoggingConfigurationRedactedFieldsArgs> redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }
        public Builder redactedFields(@Nullable WebAclLoggingConfigurationRedactedFieldsArgs redactedFields) {
            this.redactedFields = Codegen.ofNullable(redactedFields);
            return this;
        }        public WebAclLoggingConfigurationArgs build() {
            return new WebAclLoggingConfigurationArgs(logDestination, redactedFields);
        }
    }
}
