// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigArgs Empty = new DirectoryConfigArgs();

    /**
     * Fully qualified name of the directory.
     * 
     */
    @Import(name="directoryName", required=true)
      private final Output<String> directoryName;

    public Output<String> directoryName() {
        return this.directoryName;
    }

    /**
     * Distinguished names of the organizational units for computer accounts.
     * 
     */
    @Import(name="organizationalUnitDistinguishedNames", required=true)
      private final Output<List<String>> organizationalUnitDistinguishedNames;

    public Output<List<String>> organizationalUnitDistinguishedNames() {
        return this.organizationalUnitDistinguishedNames;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    @Import(name="serviceAccountCredentials", required=true)
      private final Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials;

    public Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials() {
        return this.serviceAccountCredentials;
    }

    public DirectoryConfigArgs(
        Output<String> directoryName,
        Output<List<String>> organizationalUnitDistinguishedNames,
        Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials) {
        this.directoryName = Objects.requireNonNull(directoryName, "expected parameter 'directoryName' to be non-null");
        this.organizationalUnitDistinguishedNames = Objects.requireNonNull(organizationalUnitDistinguishedNames, "expected parameter 'organizationalUnitDistinguishedNames' to be non-null");
        this.serviceAccountCredentials = Objects.requireNonNull(serviceAccountCredentials, "expected parameter 'serviceAccountCredentials' to be non-null");
    }

    private DirectoryConfigArgs() {
        this.directoryName = Codegen.empty();
        this.organizationalUnitDistinguishedNames = Codegen.empty();
        this.serviceAccountCredentials = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> directoryName;
        private Output<List<String>> organizationalUnitDistinguishedNames;
        private Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedNames = defaults.organizationalUnitDistinguishedNames;
    	      this.serviceAccountCredentials = defaults.serviceAccountCredentials;
        }

        public Builder directoryName(Output<String> directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }
        public Builder directoryName(String directoryName) {
            this.directoryName = Output.of(Objects.requireNonNull(directoryName));
            return this;
        }
        public Builder organizationalUnitDistinguishedNames(Output<List<String>> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = Objects.requireNonNull(organizationalUnitDistinguishedNames);
            return this;
        }
        public Builder organizationalUnitDistinguishedNames(List<String> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = Output.of(Objects.requireNonNull(organizationalUnitDistinguishedNames));
            return this;
        }
        public Builder organizationalUnitDistinguishedNames(String... organizationalUnitDistinguishedNames) {
            return organizationalUnitDistinguishedNames(List.of(organizationalUnitDistinguishedNames));
        }
        public Builder serviceAccountCredentials(Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials) {
            this.serviceAccountCredentials = Objects.requireNonNull(serviceAccountCredentials);
            return this;
        }
        public Builder serviceAccountCredentials(DirectoryConfigServiceAccountCredentialsArgs serviceAccountCredentials) {
            this.serviceAccountCredentials = Output.of(Objects.requireNonNull(serviceAccountCredentials));
            return this;
        }        public DirectoryConfigArgs build() {
            return new DirectoryConfigArgs(directoryName, organizationalUnitDistinguishedNames, serviceAccountCredentials);
        }
    }
}
