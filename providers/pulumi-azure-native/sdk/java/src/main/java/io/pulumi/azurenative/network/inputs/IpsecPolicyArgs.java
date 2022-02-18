// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.DhGroup;
import io.pulumi.azurenative.network.enums.IkeEncryption;
import io.pulumi.azurenative.network.enums.IkeIntegrity;
import io.pulumi.azurenative.network.enums.IpsecEncryption;
import io.pulumi.azurenative.network.enums.IpsecIntegrity;
import io.pulumi.azurenative.network.enums.PfsGroup;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * An IPSec Policy configuration for a virtual network gateway connection.
 * 
 */
public final class IpsecPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpsecPolicyArgs Empty = new IpsecPolicyArgs();

    /**
     * The DH Group used in IKE Phase 1 for initial SA.
     * 
     */
    @InputImport(name="dhGroup", required=true)
    private final Input<Either<String,DhGroup>> dhGroup;

    public Input<Either<String,DhGroup>> getDhGroup() {
        return this.dhGroup;
    }

    /**
     * The IKE encryption algorithm (IKE phase 2).
     * 
     */
    @InputImport(name="ikeEncryption", required=true)
    private final Input<Either<String,IkeEncryption>> ikeEncryption;

    public Input<Either<String,IkeEncryption>> getIkeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * The IKE integrity algorithm (IKE phase 2).
     * 
     */
    @InputImport(name="ikeIntegrity", required=true)
    private final Input<Either<String,IkeIntegrity>> ikeIntegrity;

    public Input<Either<String,IkeIntegrity>> getIkeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * The IPSec encryption algorithm (IKE phase 1).
     * 
     */
    @InputImport(name="ipsecEncryption", required=true)
    private final Input<Either<String,IpsecEncryption>> ipsecEncryption;

    public Input<Either<String,IpsecEncryption>> getIpsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * The IPSec integrity algorithm (IKE phase 1).
     * 
     */
    @InputImport(name="ipsecIntegrity", required=true)
    private final Input<Either<String,IpsecIntegrity>> ipsecIntegrity;

    public Input<Either<String,IpsecIntegrity>> getIpsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * The Pfs Group used in IKE Phase 2 for new child SA.
     * 
     */
    @InputImport(name="pfsGroup", required=true)
    private final Input<Either<String,PfsGroup>> pfsGroup;

    public Input<Either<String,PfsGroup>> getPfsGroup() {
        return this.pfsGroup;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for a site to site VPN tunnel.
     * 
     */
    @InputImport(name="saDataSizeKilobytes", required=true)
    private final Input<Integer> saDataSizeKilobytes;

    public Input<Integer> getSaDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for a site to site VPN tunnel.
     * 
     */
    @InputImport(name="saLifeTimeSeconds", required=true)
    private final Input<Integer> saLifeTimeSeconds;

    public Input<Integer> getSaLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    public IpsecPolicyArgs(
        Input<Either<String,DhGroup>> dhGroup,
        Input<Either<String,IkeEncryption>> ikeEncryption,
        Input<Either<String,IkeIntegrity>> ikeIntegrity,
        Input<Either<String,IpsecEncryption>> ipsecEncryption,
        Input<Either<String,IpsecIntegrity>> ipsecIntegrity,
        Input<Either<String,PfsGroup>> pfsGroup,
        Input<Integer> saDataSizeKilobytes,
        Input<Integer> saLifeTimeSeconds) {
        this.dhGroup = Objects.requireNonNull(dhGroup, "expected parameter 'dhGroup' to be non-null");
        this.ikeEncryption = Objects.requireNonNull(ikeEncryption, "expected parameter 'ikeEncryption' to be non-null");
        this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity, "expected parameter 'ikeIntegrity' to be non-null");
        this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption, "expected parameter 'ipsecEncryption' to be non-null");
        this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity, "expected parameter 'ipsecIntegrity' to be non-null");
        this.pfsGroup = Objects.requireNonNull(pfsGroup, "expected parameter 'pfsGroup' to be non-null");
        this.saDataSizeKilobytes = Objects.requireNonNull(saDataSizeKilobytes, "expected parameter 'saDataSizeKilobytes' to be non-null");
        this.saLifeTimeSeconds = Objects.requireNonNull(saLifeTimeSeconds, "expected parameter 'saLifeTimeSeconds' to be non-null");
    }

    private IpsecPolicyArgs() {
        this.dhGroup = Input.empty();
        this.ikeEncryption = Input.empty();
        this.ikeIntegrity = Input.empty();
        this.ipsecEncryption = Input.empty();
        this.ipsecIntegrity = Input.empty();
        this.pfsGroup = Input.empty();
        this.saDataSizeKilobytes = Input.empty();
        this.saLifeTimeSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpsecPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DhGroup>> dhGroup;
        private Input<Either<String,IkeEncryption>> ikeEncryption;
        private Input<Either<String,IkeIntegrity>> ikeIntegrity;
        private Input<Either<String,IpsecEncryption>> ipsecEncryption;
        private Input<Either<String,IpsecIntegrity>> ipsecIntegrity;
        private Input<Either<String,PfsGroup>> pfsGroup;
        private Input<Integer> saDataSizeKilobytes;
        private Input<Integer> saLifeTimeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(IpsecPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhGroup = defaults.dhGroup;
    	      this.ikeEncryption = defaults.ikeEncryption;
    	      this.ikeIntegrity = defaults.ikeIntegrity;
    	      this.ipsecEncryption = defaults.ipsecEncryption;
    	      this.ipsecIntegrity = defaults.ipsecIntegrity;
    	      this.pfsGroup = defaults.pfsGroup;
    	      this.saDataSizeKilobytes = defaults.saDataSizeKilobytes;
    	      this.saLifeTimeSeconds = defaults.saLifeTimeSeconds;
        }

        public Builder setDhGroup(Input<Either<String,DhGroup>> dhGroup) {
            this.dhGroup = Objects.requireNonNull(dhGroup);
            return this;
        }

        public Builder setDhGroup(Either<String,DhGroup> dhGroup) {
            this.dhGroup = Input.of(Objects.requireNonNull(dhGroup));
            return this;
        }

        public Builder setIkeEncryption(Input<Either<String,IkeEncryption>> ikeEncryption) {
            this.ikeEncryption = Objects.requireNonNull(ikeEncryption);
            return this;
        }

        public Builder setIkeEncryption(Either<String,IkeEncryption> ikeEncryption) {
            this.ikeEncryption = Input.of(Objects.requireNonNull(ikeEncryption));
            return this;
        }

        public Builder setIkeIntegrity(Input<Either<String,IkeIntegrity>> ikeIntegrity) {
            this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity);
            return this;
        }

        public Builder setIkeIntegrity(Either<String,IkeIntegrity> ikeIntegrity) {
            this.ikeIntegrity = Input.of(Objects.requireNonNull(ikeIntegrity));
            return this;
        }

        public Builder setIpsecEncryption(Input<Either<String,IpsecEncryption>> ipsecEncryption) {
            this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption);
            return this;
        }

        public Builder setIpsecEncryption(Either<String,IpsecEncryption> ipsecEncryption) {
            this.ipsecEncryption = Input.of(Objects.requireNonNull(ipsecEncryption));
            return this;
        }

        public Builder setIpsecIntegrity(Input<Either<String,IpsecIntegrity>> ipsecIntegrity) {
            this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity);
            return this;
        }

        public Builder setIpsecIntegrity(Either<String,IpsecIntegrity> ipsecIntegrity) {
            this.ipsecIntegrity = Input.of(Objects.requireNonNull(ipsecIntegrity));
            return this;
        }

        public Builder setPfsGroup(Input<Either<String,PfsGroup>> pfsGroup) {
            this.pfsGroup = Objects.requireNonNull(pfsGroup);
            return this;
        }

        public Builder setPfsGroup(Either<String,PfsGroup> pfsGroup) {
            this.pfsGroup = Input.of(Objects.requireNonNull(pfsGroup));
            return this;
        }

        public Builder setSaDataSizeKilobytes(Input<Integer> saDataSizeKilobytes) {
            this.saDataSizeKilobytes = Objects.requireNonNull(saDataSizeKilobytes);
            return this;
        }

        public Builder setSaDataSizeKilobytes(Integer saDataSizeKilobytes) {
            this.saDataSizeKilobytes = Input.of(Objects.requireNonNull(saDataSizeKilobytes));
            return this;
        }

        public Builder setSaLifeTimeSeconds(Input<Integer> saLifeTimeSeconds) {
            this.saLifeTimeSeconds = Objects.requireNonNull(saLifeTimeSeconds);
            return this;
        }

        public Builder setSaLifeTimeSeconds(Integer saLifeTimeSeconds) {
            this.saLifeTimeSeconds = Input.of(Objects.requireNonNull(saLifeTimeSeconds));
            return this;
        }

        public IpsecPolicyArgs build() {
            return new IpsecPolicyArgs(dhGroup, ikeEncryption, ikeIntegrity, ipsecEncryption, ipsecIntegrity, pfsGroup, saDataSizeKilobytes, saLifeTimeSeconds);
        }
    }
}
