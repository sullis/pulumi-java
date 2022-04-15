// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointArgs Empty = new ObjectLambdaAccessPointArgs();

    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @Import(name="configuration", required=true)
      private final Output<ObjectLambdaAccessPointConfigurationArgs> configuration;

    public Output<ObjectLambdaAccessPointConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ObjectLambdaAccessPointArgs(
        @Nullable Output<String> accountId,
        Output<ObjectLambdaAccessPointConfigurationArgs> configuration,
        @Nullable Output<String> name) {
        this.accountId = accountId;
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.name = name;
    }

    private ObjectLambdaAccessPointArgs() {
        this.accountId = Codegen.empty();
        this.configuration = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<ObjectLambdaAccessPointConfigurationArgs> configuration;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder configuration(Output<ObjectLambdaAccessPointConfigurationArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder configuration(ObjectLambdaAccessPointConfigurationArgs configuration) {
            this.configuration = Output.of(Objects.requireNonNull(configuration));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ObjectLambdaAccessPointArgs build() {
            return new ObjectLambdaAccessPointArgs(accountId, configuration, name);
        }
    }
}
