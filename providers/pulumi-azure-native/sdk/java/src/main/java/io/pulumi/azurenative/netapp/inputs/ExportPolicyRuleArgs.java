// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume Export Policy Rule
 * 
 */
public final class ExportPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportPolicyRuleArgs Empty = new ExportPolicyRuleArgs();

    /**
     * Client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names
     * 
     */
    @Import(name="allowedClients")
      private final @Nullable Output<String> allowedClients;

    public Output<String> getAllowedClients() {
        return this.allowedClients == null ? Output.empty() : this.allowedClients;
    }

    /**
     * Allows CIFS protocol
     * 
     */
    @Import(name="cifs")
      private final @Nullable Output<Boolean> cifs;

    public Output<Boolean> getCifs() {
        return this.cifs == null ? Output.empty() : this.cifs;
    }

    /**
     * Has root access to volume
     * 
     */
    @Import(name="hasRootAccess")
      private final @Nullable Output<Boolean> hasRootAccess;

    public Output<Boolean> getHasRootAccess() {
        return this.hasRootAccess == null ? Output.empty() : this.hasRootAccess;
    }

    /**
     * Kerberos5 Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5ReadOnly")
      private final @Nullable Output<Boolean> kerberos5ReadOnly;

    public Output<Boolean> getKerberos5ReadOnly() {
        return this.kerberos5ReadOnly == null ? Output.empty() : this.kerberos5ReadOnly;
    }

    /**
     * Kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5ReadWrite")
      private final @Nullable Output<Boolean> kerberos5ReadWrite;

    public Output<Boolean> getKerberos5ReadWrite() {
        return this.kerberos5ReadWrite == null ? Output.empty() : this.kerberos5ReadWrite;
    }

    /**
     * Kerberos5i Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5iReadOnly")
      private final @Nullable Output<Boolean> kerberos5iReadOnly;

    public Output<Boolean> getKerberos5iReadOnly() {
        return this.kerberos5iReadOnly == null ? Output.empty() : this.kerberos5iReadOnly;
    }

    /**
     * Kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5iReadWrite")
      private final @Nullable Output<Boolean> kerberos5iReadWrite;

    public Output<Boolean> getKerberos5iReadWrite() {
        return this.kerberos5iReadWrite == null ? Output.empty() : this.kerberos5iReadWrite;
    }

    /**
     * Kerberos5p Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5pReadOnly")
      private final @Nullable Output<Boolean> kerberos5pReadOnly;

    public Output<Boolean> getKerberos5pReadOnly() {
        return this.kerberos5pReadOnly == null ? Output.empty() : this.kerberos5pReadOnly;
    }

    /**
     * Kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Import(name="kerberos5pReadWrite")
      private final @Nullable Output<Boolean> kerberos5pReadWrite;

    public Output<Boolean> getKerberos5pReadWrite() {
        return this.kerberos5pReadWrite == null ? Output.empty() : this.kerberos5pReadWrite;
    }

    /**
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes
     * 
     */
    @Import(name="nfsv3")
      private final @Nullable Output<Boolean> nfsv3;

    public Output<Boolean> getNfsv3() {
        return this.nfsv3 == null ? Output.empty() : this.nfsv3;
    }

    /**
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes
     * 
     */
    @Import(name="nfsv41")
      private final @Nullable Output<Boolean> nfsv41;

    public Output<Boolean> getNfsv41() {
        return this.nfsv41 == null ? Output.empty() : this.nfsv41;
    }

    /**
     * Order index
     * 
     */
    @Import(name="ruleIndex")
      private final @Nullable Output<Integer> ruleIndex;

    public Output<Integer> getRuleIndex() {
        return this.ruleIndex == null ? Output.empty() : this.ruleIndex;
    }

    /**
     * Read only access
     * 
     */
    @Import(name="unixReadOnly")
      private final @Nullable Output<Boolean> unixReadOnly;

    public Output<Boolean> getUnixReadOnly() {
        return this.unixReadOnly == null ? Output.empty() : this.unixReadOnly;
    }

    /**
     * Read and write access
     * 
     */
    @Import(name="unixReadWrite")
      private final @Nullable Output<Boolean> unixReadWrite;

    public Output<Boolean> getUnixReadWrite() {
        return this.unixReadWrite == null ? Output.empty() : this.unixReadWrite;
    }

    public ExportPolicyRuleArgs(
        @Nullable Output<String> allowedClients,
        @Nullable Output<Boolean> cifs,
        @Nullable Output<Boolean> hasRootAccess,
        @Nullable Output<Boolean> kerberos5ReadOnly,
        @Nullable Output<Boolean> kerberos5ReadWrite,
        @Nullable Output<Boolean> kerberos5iReadOnly,
        @Nullable Output<Boolean> kerberos5iReadWrite,
        @Nullable Output<Boolean> kerberos5pReadOnly,
        @Nullable Output<Boolean> kerberos5pReadWrite,
        @Nullable Output<Boolean> nfsv3,
        @Nullable Output<Boolean> nfsv41,
        @Nullable Output<Integer> ruleIndex,
        @Nullable Output<Boolean> unixReadOnly,
        @Nullable Output<Boolean> unixReadWrite) {
        this.allowedClients = allowedClients;
        this.cifs = cifs;
        this.hasRootAccess = hasRootAccess == null ? Output.ofNullable(true) : hasRootAccess;
        this.kerberos5ReadOnly = kerberos5ReadOnly == null ? Output.ofNullable(false) : kerberos5ReadOnly;
        this.kerberos5ReadWrite = kerberos5ReadWrite == null ? Output.ofNullable(false) : kerberos5ReadWrite;
        this.kerberos5iReadOnly = kerberos5iReadOnly == null ? Output.ofNullable(false) : kerberos5iReadOnly;
        this.kerberos5iReadWrite = kerberos5iReadWrite == null ? Output.ofNullable(false) : kerberos5iReadWrite;
        this.kerberos5pReadOnly = kerberos5pReadOnly == null ? Output.ofNullable(false) : kerberos5pReadOnly;
        this.kerberos5pReadWrite = kerberos5pReadWrite == null ? Output.ofNullable(false) : kerberos5pReadWrite;
        this.nfsv3 = nfsv3;
        this.nfsv41 = nfsv41;
        this.ruleIndex = ruleIndex;
        this.unixReadOnly = unixReadOnly;
        this.unixReadWrite = unixReadWrite;
    }

    private ExportPolicyRuleArgs() {
        this.allowedClients = Output.empty();
        this.cifs = Output.empty();
        this.hasRootAccess = Output.empty();
        this.kerberos5ReadOnly = Output.empty();
        this.kerberos5ReadWrite = Output.empty();
        this.kerberos5iReadOnly = Output.empty();
        this.kerberos5iReadWrite = Output.empty();
        this.kerberos5pReadOnly = Output.empty();
        this.kerberos5pReadWrite = Output.empty();
        this.nfsv3 = Output.empty();
        this.nfsv41 = Output.empty();
        this.ruleIndex = Output.empty();
        this.unixReadOnly = Output.empty();
        this.unixReadWrite = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowedClients;
        private @Nullable Output<Boolean> cifs;
        private @Nullable Output<Boolean> hasRootAccess;
        private @Nullable Output<Boolean> kerberos5ReadOnly;
        private @Nullable Output<Boolean> kerberos5ReadWrite;
        private @Nullable Output<Boolean> kerberos5iReadOnly;
        private @Nullable Output<Boolean> kerberos5iReadWrite;
        private @Nullable Output<Boolean> kerberos5pReadOnly;
        private @Nullable Output<Boolean> kerberos5pReadWrite;
        private @Nullable Output<Boolean> nfsv3;
        private @Nullable Output<Boolean> nfsv41;
        private @Nullable Output<Integer> ruleIndex;
        private @Nullable Output<Boolean> unixReadOnly;
        private @Nullable Output<Boolean> unixReadWrite;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClients = defaults.allowedClients;
    	      this.cifs = defaults.cifs;
    	      this.hasRootAccess = defaults.hasRootAccess;
    	      this.kerberos5ReadOnly = defaults.kerberos5ReadOnly;
    	      this.kerberos5ReadWrite = defaults.kerberos5ReadWrite;
    	      this.kerberos5iReadOnly = defaults.kerberos5iReadOnly;
    	      this.kerberos5iReadWrite = defaults.kerberos5iReadWrite;
    	      this.kerberos5pReadOnly = defaults.kerberos5pReadOnly;
    	      this.kerberos5pReadWrite = defaults.kerberos5pReadWrite;
    	      this.nfsv3 = defaults.nfsv3;
    	      this.nfsv41 = defaults.nfsv41;
    	      this.ruleIndex = defaults.ruleIndex;
    	      this.unixReadOnly = defaults.unixReadOnly;
    	      this.unixReadWrite = defaults.unixReadWrite;
        }

        public Builder allowedClients(@Nullable Output<String> allowedClients) {
            this.allowedClients = allowedClients;
            return this;
        }
        public Builder allowedClients(@Nullable String allowedClients) {
            this.allowedClients = Output.ofNullable(allowedClients);
            return this;
        }
        public Builder cifs(@Nullable Output<Boolean> cifs) {
            this.cifs = cifs;
            return this;
        }
        public Builder cifs(@Nullable Boolean cifs) {
            this.cifs = Output.ofNullable(cifs);
            return this;
        }
        public Builder hasRootAccess(@Nullable Output<Boolean> hasRootAccess) {
            this.hasRootAccess = hasRootAccess;
            return this;
        }
        public Builder hasRootAccess(@Nullable Boolean hasRootAccess) {
            this.hasRootAccess = Output.ofNullable(hasRootAccess);
            return this;
        }
        public Builder kerberos5ReadOnly(@Nullable Output<Boolean> kerberos5ReadOnly) {
            this.kerberos5ReadOnly = kerberos5ReadOnly;
            return this;
        }
        public Builder kerberos5ReadOnly(@Nullable Boolean kerberos5ReadOnly) {
            this.kerberos5ReadOnly = Output.ofNullable(kerberos5ReadOnly);
            return this;
        }
        public Builder kerberos5ReadWrite(@Nullable Output<Boolean> kerberos5ReadWrite) {
            this.kerberos5ReadWrite = kerberos5ReadWrite;
            return this;
        }
        public Builder kerberos5ReadWrite(@Nullable Boolean kerberos5ReadWrite) {
            this.kerberos5ReadWrite = Output.ofNullable(kerberos5ReadWrite);
            return this;
        }
        public Builder kerberos5iReadOnly(@Nullable Output<Boolean> kerberos5iReadOnly) {
            this.kerberos5iReadOnly = kerberos5iReadOnly;
            return this;
        }
        public Builder kerberos5iReadOnly(@Nullable Boolean kerberos5iReadOnly) {
            this.kerberos5iReadOnly = Output.ofNullable(kerberos5iReadOnly);
            return this;
        }
        public Builder kerberos5iReadWrite(@Nullable Output<Boolean> kerberos5iReadWrite) {
            this.kerberos5iReadWrite = kerberos5iReadWrite;
            return this;
        }
        public Builder kerberos5iReadWrite(@Nullable Boolean kerberos5iReadWrite) {
            this.kerberos5iReadWrite = Output.ofNullable(kerberos5iReadWrite);
            return this;
        }
        public Builder kerberos5pReadOnly(@Nullable Output<Boolean> kerberos5pReadOnly) {
            this.kerberos5pReadOnly = kerberos5pReadOnly;
            return this;
        }
        public Builder kerberos5pReadOnly(@Nullable Boolean kerberos5pReadOnly) {
            this.kerberos5pReadOnly = Output.ofNullable(kerberos5pReadOnly);
            return this;
        }
        public Builder kerberos5pReadWrite(@Nullable Output<Boolean> kerberos5pReadWrite) {
            this.kerberos5pReadWrite = kerberos5pReadWrite;
            return this;
        }
        public Builder kerberos5pReadWrite(@Nullable Boolean kerberos5pReadWrite) {
            this.kerberos5pReadWrite = Output.ofNullable(kerberos5pReadWrite);
            return this;
        }
        public Builder nfsv3(@Nullable Output<Boolean> nfsv3) {
            this.nfsv3 = nfsv3;
            return this;
        }
        public Builder nfsv3(@Nullable Boolean nfsv3) {
            this.nfsv3 = Output.ofNullable(nfsv3);
            return this;
        }
        public Builder nfsv41(@Nullable Output<Boolean> nfsv41) {
            this.nfsv41 = nfsv41;
            return this;
        }
        public Builder nfsv41(@Nullable Boolean nfsv41) {
            this.nfsv41 = Output.ofNullable(nfsv41);
            return this;
        }
        public Builder ruleIndex(@Nullable Output<Integer> ruleIndex) {
            this.ruleIndex = ruleIndex;
            return this;
        }
        public Builder ruleIndex(@Nullable Integer ruleIndex) {
            this.ruleIndex = Output.ofNullable(ruleIndex);
            return this;
        }
        public Builder unixReadOnly(@Nullable Output<Boolean> unixReadOnly) {
            this.unixReadOnly = unixReadOnly;
            return this;
        }
        public Builder unixReadOnly(@Nullable Boolean unixReadOnly) {
            this.unixReadOnly = Output.ofNullable(unixReadOnly);
            return this;
        }
        public Builder unixReadWrite(@Nullable Output<Boolean> unixReadWrite) {
            this.unixReadWrite = unixReadWrite;
            return this;
        }
        public Builder unixReadWrite(@Nullable Boolean unixReadWrite) {
            this.unixReadWrite = Output.ofNullable(unixReadWrite);
            return this;
        }        public ExportPolicyRuleArgs build() {
            return new ExportPolicyRuleArgs(allowedClients, cifs, hasRootAccess, kerberos5ReadOnly, kerberos5ReadWrite, kerberos5iReadOnly, kerberos5iReadWrite, kerberos5pReadOnly, kerberos5pReadWrite, nfsv3, nfsv41, ruleIndex, unixReadOnly, unixReadWrite);
        }
    }
}
