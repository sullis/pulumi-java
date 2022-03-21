// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.testing_v1.inputs.ClientInfoDetailArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the client which invoked the test.
 * 
 */
public final class ClientInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientInfoArgs Empty = new ClientInfoArgs();

    /**
     * The list of detailed information about client.
     * 
     */
    @Import(name="clientInfoDetails")
      private final @Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails;

    public Output<List<ClientInfoDetailArgs>> getClientInfoDetails() {
        return this.clientInfoDetails == null ? Output.empty() : this.clientInfoDetails;
    }

    /**
     * Client name, such as gcloud.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ClientInfoArgs(
        @Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails,
        Output<String> name) {
        this.clientInfoDetails = clientInfoDetails;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClientInfoArgs() {
        this.clientInfoDetails = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInfoDetails = defaults.clientInfoDetails;
    	      this.name = defaults.name;
        }

        public Builder clientInfoDetails(@Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails) {
            this.clientInfoDetails = clientInfoDetails;
            return this;
        }
        public Builder clientInfoDetails(@Nullable List<ClientInfoDetailArgs> clientInfoDetails) {
            this.clientInfoDetails = Output.ofNullable(clientInfoDetails);
            return this;
        }
        public Builder clientInfoDetails(ClientInfoDetailArgs... clientInfoDetails) {
            return clientInfoDetails(List.of(clientInfoDetails));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ClientInfoArgs build() {
            return new ClientInfoArgs(clientInfoDetails, name);
        }
    }
}
