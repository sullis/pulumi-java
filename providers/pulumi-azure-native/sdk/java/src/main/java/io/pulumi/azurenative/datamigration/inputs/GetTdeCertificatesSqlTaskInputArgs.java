// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.FileShareArgs;
import io.pulumi.azurenative.datamigration.inputs.SelectedCertificateInputArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that gets TDE certificates in Base64 encoded format.
 * 
 */
public final class GetTdeCertificatesSqlTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GetTdeCertificatesSqlTaskInputArgs Empty = new GetTdeCertificatesSqlTaskInputArgs();

    /**
     * Backup file share information for file share to be used for temporarily storing files.
     * 
     */
    @InputImport(name="backupFileShare", required=true)
      private final Input<FileShareArgs> backupFileShare;

    public Input<FileShareArgs> getBackupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Connection information for SQL Server
     * 
     */
    @InputImport(name="connectionInfo", required=true)
      private final Input<SqlConnectionInfoArgs> connectionInfo;

    public Input<SqlConnectionInfoArgs> getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * List containing certificate names and corresponding password to use for encrypting the exported certificate.
     * 
     */
    @InputImport(name="selectedCertificates", required=true)
      private final Input<List<SelectedCertificateInputArgs>> selectedCertificates;

    public Input<List<SelectedCertificateInputArgs>> getSelectedCertificates() {
        return this.selectedCertificates;
    }

    public GetTdeCertificatesSqlTaskInputArgs(
        Input<FileShareArgs> backupFileShare,
        Input<SqlConnectionInfoArgs> connectionInfo,
        Input<List<SelectedCertificateInputArgs>> selectedCertificates) {
        this.backupFileShare = Objects.requireNonNull(backupFileShare, "expected parameter 'backupFileShare' to be non-null");
        this.connectionInfo = Objects.requireNonNull(connectionInfo, "expected parameter 'connectionInfo' to be non-null");
        this.selectedCertificates = Objects.requireNonNull(selectedCertificates, "expected parameter 'selectedCertificates' to be non-null");
    }

    private GetTdeCertificatesSqlTaskInputArgs() {
        this.backupFileShare = Input.empty();
        this.connectionInfo = Input.empty();
        this.selectedCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FileShareArgs> backupFileShare;
        private Input<SqlConnectionInfoArgs> connectionInfo;
        private Input<List<SelectedCertificateInputArgs>> selectedCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.selectedCertificates = defaults.selectedCertificates;
        }

        public Builder setBackupFileShare(Input<FileShareArgs> backupFileShare) {
            this.backupFileShare = Objects.requireNonNull(backupFileShare);
            return this;
        }

        public Builder setBackupFileShare(FileShareArgs backupFileShare) {
            this.backupFileShare = Input.of(Objects.requireNonNull(backupFileShare));
            return this;
        }

        public Builder setConnectionInfo(Input<SqlConnectionInfoArgs> connectionInfo) {
            this.connectionInfo = Objects.requireNonNull(connectionInfo);
            return this;
        }

        public Builder setConnectionInfo(SqlConnectionInfoArgs connectionInfo) {
            this.connectionInfo = Input.of(Objects.requireNonNull(connectionInfo));
            return this;
        }

        public Builder setSelectedCertificates(Input<List<SelectedCertificateInputArgs>> selectedCertificates) {
            this.selectedCertificates = Objects.requireNonNull(selectedCertificates);
            return this;
        }

        public Builder setSelectedCertificates(List<SelectedCertificateInputArgs> selectedCertificates) {
            this.selectedCertificates = Input.of(Objects.requireNonNull(selectedCertificates));
            return this;
        }
        public GetTdeCertificatesSqlTaskInputArgs build() {
            return new GetTdeCertificatesSqlTaskInputArgs(backupFileShare, connectionInfo, selectedCertificates);
        }
    }
}