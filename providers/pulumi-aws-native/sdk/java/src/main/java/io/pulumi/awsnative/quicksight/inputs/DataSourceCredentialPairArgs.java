// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSourceParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceCredentialPairArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceCredentialPairArgs Empty = new DataSourceCredentialPairArgs();

    @InputImport(name="alternateDataSourceParameters")
    private final @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters;

    public Input<List<DataSourceParametersArgs>> getAlternateDataSourceParameters() {
        return this.alternateDataSourceParameters == null ? Input.empty() : this.alternateDataSourceParameters;
    }

    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public DataSourceCredentialPairArgs(
        @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters,
        Input<String> password,
        Input<String> username) {
        this.alternateDataSourceParameters = alternateDataSourceParameters;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private DataSourceCredentialPairArgs() {
        this.alternateDataSourceParameters = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentialPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters;
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentialPairArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateDataSourceParameters = defaults.alternateDataSourceParameters;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setAlternateDataSourceParameters(@Nullable Input<List<DataSourceParametersArgs>> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = alternateDataSourceParameters;
            return this;
        }

        public Builder setAlternateDataSourceParameters(@Nullable List<DataSourceParametersArgs> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = Input.ofNullable(alternateDataSourceParameters);
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public DataSourceCredentialPairArgs build() {
            return new DataSourceCredentialPairArgs(alternateDataSourceParameters, password, username);
        }
    }
}
