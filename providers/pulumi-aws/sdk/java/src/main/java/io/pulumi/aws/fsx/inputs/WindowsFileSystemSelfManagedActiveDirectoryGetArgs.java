// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsFileSystemSelfManagedActiveDirectoryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemSelfManagedActiveDirectoryGetArgs Empty = new WindowsFileSystemSelfManagedActiveDirectoryGetArgs();

    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    @Import(name="dnsIps", required=true)
      private final Output<List<String>> dnsIps;

    public Output<List<String>> dnsIps() {
        return this.dnsIps;
    }

    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    @Import(name="fileSystemAdministratorsGroup")
      private final @Nullable Output<String> fileSystemAdministratorsGroup;

    public Output<String> fileSystemAdministratorsGroup() {
        return this.fileSystemAdministratorsGroup == null ? Codegen.empty() : this.fileSystemAdministratorsGroup;
    }

    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    @Import(name="organizationalUnitDistinguishedName")
      private final @Nullable Output<String> organizationalUnitDistinguishedName;

    public Output<String> organizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Codegen.empty() : this.organizationalUnitDistinguishedName;
    }

    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public WindowsFileSystemSelfManagedActiveDirectoryGetArgs(
        Output<List<String>> dnsIps,
        Output<String> domainName,
        @Nullable Output<String> fileSystemAdministratorsGroup,
        @Nullable Output<String> organizationalUnitDistinguishedName,
        Output<String> password,
        Output<String> username) {
        this.dnsIps = Objects.requireNonNull(dnsIps, "expected parameter 'dnsIps' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private WindowsFileSystemSelfManagedActiveDirectoryGetArgs() {
        this.dnsIps = Codegen.empty();
        this.domainName = Codegen.empty();
        this.fileSystemAdministratorsGroup = Codegen.empty();
        this.organizationalUnitDistinguishedName = Codegen.empty();
        this.password = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemSelfManagedActiveDirectoryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> dnsIps;
        private Output<String> domainName;
        private @Nullable Output<String> fileSystemAdministratorsGroup;
        private @Nullable Output<String> organizationalUnitDistinguishedName;
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemSelfManagedActiveDirectoryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsIps = defaults.dnsIps;
    	      this.domainName = defaults.domainName;
    	      this.fileSystemAdministratorsGroup = defaults.fileSystemAdministratorsGroup;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder dnsIps(Output<List<String>> dnsIps) {
            this.dnsIps = Objects.requireNonNull(dnsIps);
            return this;
        }
        public Builder dnsIps(List<String> dnsIps) {
            this.dnsIps = Output.of(Objects.requireNonNull(dnsIps));
            return this;
        }
        public Builder dnsIps(String... dnsIps) {
            return dnsIps(List.of(dnsIps));
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder fileSystemAdministratorsGroup(@Nullable Output<String> fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }
        public Builder fileSystemAdministratorsGroup(@Nullable String fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = Codegen.ofNullable(fileSystemAdministratorsGroup);
            return this;
        }
        public Builder organizationalUnitDistinguishedName(@Nullable Output<String> organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }
        public Builder organizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = Codegen.ofNullable(organizationalUnitDistinguishedName);
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public WindowsFileSystemSelfManagedActiveDirectoryGetArgs build() {
            return new WindowsFileSystemSelfManagedActiveDirectoryGetArgs(dnsIps, domainName, fileSystemAdministratorsGroup, organizationalUnitDistinguishedName, password, username);
        }
    }
}
