// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace;

import io.pulumi.awsnative.finspace.enums.EnvironmentFederationMode;
import io.pulumi.awsnative.finspace.inputs.EnvironmentFederationParametersArgs;
import io.pulumi.awsnative.finspace.inputs.EnvironmentSuperuserParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @InputImport(name="dataBundles")
    private final @Nullable Input<List<String>> dataBundles;

    public Input<List<String>> getDataBundles() {
        return this.dataBundles == null ? Input.empty() : this.dataBundles;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="federationMode")
    private final @Nullable Input<EnvironmentFederationMode> federationMode;

    public Input<EnvironmentFederationMode> getFederationMode() {
        return this.federationMode == null ? Input.empty() : this.federationMode;
    }

    @InputImport(name="federationParameters")
    private final @Nullable Input<EnvironmentFederationParametersArgs> federationParameters;

    public Input<EnvironmentFederationParametersArgs> getFederationParameters() {
        return this.federationParameters == null ? Input.empty() : this.federationParameters;
    }

    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="superuserParameters")
    private final @Nullable Input<EnvironmentSuperuserParametersArgs> superuserParameters;

    public Input<EnvironmentSuperuserParametersArgs> getSuperuserParameters() {
        return this.superuserParameters == null ? Input.empty() : this.superuserParameters;
    }

    public EnvironmentArgs(
        @Nullable Input<List<String>> dataBundles,
        @Nullable Input<String> description,
        @Nullable Input<EnvironmentFederationMode> federationMode,
        @Nullable Input<EnvironmentFederationParametersArgs> federationParameters,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> name,
        @Nullable Input<EnvironmentSuperuserParametersArgs> superuserParameters) {
        this.dataBundles = dataBundles;
        this.description = description;
        this.federationMode = federationMode;
        this.federationParameters = federationParameters;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.superuserParameters = superuserParameters;
    }

    private EnvironmentArgs() {
        this.dataBundles = Input.empty();
        this.description = Input.empty();
        this.federationMode = Input.empty();
        this.federationParameters = Input.empty();
        this.kmsKeyId = Input.empty();
        this.name = Input.empty();
        this.superuserParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dataBundles;
        private @Nullable Input<String> description;
        private @Nullable Input<EnvironmentFederationMode> federationMode;
        private @Nullable Input<EnvironmentFederationParametersArgs> federationParameters;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> name;
        private @Nullable Input<EnvironmentSuperuserParametersArgs> superuserParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataBundles = defaults.dataBundles;
    	      this.description = defaults.description;
    	      this.federationMode = defaults.federationMode;
    	      this.federationParameters = defaults.federationParameters;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.superuserParameters = defaults.superuserParameters;
        }

        public Builder setDataBundles(@Nullable Input<List<String>> dataBundles) {
            this.dataBundles = dataBundles;
            return this;
        }

        public Builder setDataBundles(@Nullable List<String> dataBundles) {
            this.dataBundles = Input.ofNullable(dataBundles);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFederationMode(@Nullable Input<EnvironmentFederationMode> federationMode) {
            this.federationMode = federationMode;
            return this;
        }

        public Builder setFederationMode(@Nullable EnvironmentFederationMode federationMode) {
            this.federationMode = Input.ofNullable(federationMode);
            return this;
        }

        public Builder setFederationParameters(@Nullable Input<EnvironmentFederationParametersArgs> federationParameters) {
            this.federationParameters = federationParameters;
            return this;
        }

        public Builder setFederationParameters(@Nullable EnvironmentFederationParametersArgs federationParameters) {
            this.federationParameters = Input.ofNullable(federationParameters);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSuperuserParameters(@Nullable Input<EnvironmentSuperuserParametersArgs> superuserParameters) {
            this.superuserParameters = superuserParameters;
            return this;
        }

        public Builder setSuperuserParameters(@Nullable EnvironmentSuperuserParametersArgs superuserParameters) {
            this.superuserParameters = Input.ofNullable(superuserParameters);
            return this;
        }

        public EnvironmentArgs build() {
            return new EnvironmentArgs(dataBundles, description, federationMode, federationParameters, kmsKeyId, name, superuserParameters);
        }
    }
}
