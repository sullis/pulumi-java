// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.AuthorityResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.BasisResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.BuildResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DeployableResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DiscoveryResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DocumentNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.FileNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.InTotoResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.PackageInfoNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.PackageResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.RelatedUrlResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.RelationshipNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.VulnerabilityResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNoteResult {
    /**
     * A note describing an attestation role.
     * 
     */
    private final AuthorityResponse attestationAuthority;
    /**
     * A note describing a base image.
     * 
     */
    private final BasisResponse baseImage;
    /**
     * A note describing build provenance for a verifiable build.
     * 
     */
    private final BuildResponse build;
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    private final String createTime;
    /**
     * A note describing something that can be deployed.
     * 
     */
    private final DeployableResponse deployable;
    /**
     * A note describing the initial analysis of a resource.
     * 
     */
    private final DiscoveryResponse discovery;
    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
     */
    private final String expirationTime;
    /**
     * A note describing an in-toto link.
     * 
     */
    private final InTotoResponse intoto;
    /**
     * The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * A detailed description of this note.
     * 
     */
    private final String longDescription;
    /**
     * The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    private final String name;
    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    private final PackageResponse $package;
    /**
     * Other notes related to this note.
     * 
     */
    private final List<String> relatedNoteNames;
    /**
     * URLs associated with this note.
     * 
     */
    private final List<RelatedUrlResponse> relatedUrl;
    /**
     * A note describing a software bill of materials.
     * 
     */
    private final DocumentNoteResponse sbom;
    /**
     * A one sentence description of this note.
     * 
     */
    private final String shortDescription;
    /**
     * A note describing an SPDX File.
     * 
     */
    private final FileNoteResponse spdxFile;
    /**
     * A note describing an SPDX Package.
     * 
     */
    private final PackageInfoNoteResponse spdxPackage;
    /**
     * A note describing an SPDX File.
     * 
     */
    private final RelationshipNoteResponse spdxRelationship;
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    private final String updateTime;
    /**
     * A note describing a package vulnerability.
     * 
     */
    private final VulnerabilityResponse vulnerability;

    @OutputCustomType.Constructor({"attestationAuthority","baseImage","build","createTime","deployable","discovery","expirationTime","intoto","kind","longDescription","name","$package","relatedNoteNames","relatedUrl","sbom","shortDescription","spdxFile","spdxPackage","spdxRelationship","updateTime","vulnerability"})
    private GetNoteResult(
        AuthorityResponse attestationAuthority,
        BasisResponse baseImage,
        BuildResponse build,
        String createTime,
        DeployableResponse deployable,
        DiscoveryResponse discovery,
        String expirationTime,
        InTotoResponse intoto,
        String kind,
        String longDescription,
        String name,
        PackageResponse $package,
        List<String> relatedNoteNames,
        List<RelatedUrlResponse> relatedUrl,
        DocumentNoteResponse sbom,
        String shortDescription,
        FileNoteResponse spdxFile,
        PackageInfoNoteResponse spdxPackage,
        RelationshipNoteResponse spdxRelationship,
        String updateTime,
        VulnerabilityResponse vulnerability) {
        this.attestationAuthority = Objects.requireNonNull(attestationAuthority);
        this.baseImage = Objects.requireNonNull(baseImage);
        this.build = Objects.requireNonNull(build);
        this.createTime = Objects.requireNonNull(createTime);
        this.deployable = Objects.requireNonNull(deployable);
        this.discovery = Objects.requireNonNull(discovery);
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.intoto = Objects.requireNonNull(intoto);
        this.kind = Objects.requireNonNull(kind);
        this.longDescription = Objects.requireNonNull(longDescription);
        this.name = Objects.requireNonNull(name);
        this.$package = Objects.requireNonNull($package);
        this.relatedNoteNames = Objects.requireNonNull(relatedNoteNames);
        this.relatedUrl = Objects.requireNonNull(relatedUrl);
        this.sbom = Objects.requireNonNull(sbom);
        this.shortDescription = Objects.requireNonNull(shortDescription);
        this.spdxFile = Objects.requireNonNull(spdxFile);
        this.spdxPackage = Objects.requireNonNull(spdxPackage);
        this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.vulnerability = Objects.requireNonNull(vulnerability);
    }

    /**
     * A note describing an attestation role.
     * 
    */
    public AuthorityResponse getAttestationAuthority() {
        return this.attestationAuthority;
    }
    /**
     * A note describing a base image.
     * 
    */
    public BasisResponse getBaseImage() {
        return this.baseImage;
    }
    /**
     * A note describing build provenance for a verifiable build.
     * 
    */
    public BuildResponse getBuild() {
        return this.build;
    }
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A note describing something that can be deployed.
     * 
    */
    public DeployableResponse getDeployable() {
        return this.deployable;
    }
    /**
     * A note describing the initial analysis of a resource.
     * 
    */
    public DiscoveryResponse getDiscovery() {
        return this.discovery;
    }
    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
    */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * A note describing an in-toto link.
     * 
    */
    public InTotoResponse getIntoto() {
        return this.intoto;
    }
    /**
     * The type of analysis. This field can be used as a filter in list requests.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A detailed description of this note.
     * 
    */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A note describing a package hosted by various package managers.
     * 
    */
    public PackageResponse get$package() {
        return this.$package;
    }
    /**
     * Other notes related to this note.
     * 
    */
    public List<String> getRelatedNoteNames() {
        return this.relatedNoteNames;
    }
    /**
     * URLs associated with this note.
     * 
    */
    public List<RelatedUrlResponse> getRelatedUrl() {
        return this.relatedUrl;
    }
    /**
     * A note describing a software bill of materials.
     * 
    */
    public DocumentNoteResponse getSbom() {
        return this.sbom;
    }
    /**
     * A one sentence description of this note.
     * 
    */
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * A note describing an SPDX File.
     * 
    */
    public FileNoteResponse getSpdxFile() {
        return this.spdxFile;
    }
    /**
     * A note describing an SPDX Package.
     * 
    */
    public PackageInfoNoteResponse getSpdxPackage() {
        return this.spdxPackage;
    }
    /**
     * A note describing an SPDX File.
     * 
    */
    public RelationshipNoteResponse getSpdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A note describing a package vulnerability.
     * 
    */
    public VulnerabilityResponse getVulnerability() {
        return this.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityResponse attestationAuthority;
        private BasisResponse baseImage;
        private BuildResponse build;
        private String createTime;
        private DeployableResponse deployable;
        private DiscoveryResponse discovery;
        private String expirationTime;
        private InTotoResponse intoto;
        private String kind;
        private String longDescription;
        private String name;
        private PackageResponse $package;
        private List<String> relatedNoteNames;
        private List<RelatedUrlResponse> relatedUrl;
        private DocumentNoteResponse sbom;
        private String shortDescription;
        private FileNoteResponse spdxFile;
        private PackageInfoNoteResponse spdxPackage;
        private RelationshipNoteResponse spdxRelationship;
        private String updateTime;
        private VulnerabilityResponse vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthority = defaults.attestationAuthority;
    	      this.baseImage = defaults.baseImage;
    	      this.build = defaults.build;
    	      this.createTime = defaults.createTime;
    	      this.deployable = defaults.deployable;
    	      this.discovery = defaults.discovery;
    	      this.expirationTime = defaults.expirationTime;
    	      this.intoto = defaults.intoto;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.$package = defaults.$package;
    	      this.relatedNoteNames = defaults.relatedNoteNames;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.sbom = defaults.sbom;
    	      this.shortDescription = defaults.shortDescription;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder setAttestationAuthority(AuthorityResponse attestationAuthority) {
            this.attestationAuthority = Objects.requireNonNull(attestationAuthority);
            return this;
        }

        public Builder setBaseImage(BasisResponse baseImage) {
            this.baseImage = Objects.requireNonNull(baseImage);
            return this;
        }

        public Builder setBuild(BuildResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeployable(DeployableResponse deployable) {
            this.deployable = Objects.requireNonNull(deployable);
            return this;
        }

        public Builder setDiscovery(DiscoveryResponse discovery) {
            this.discovery = Objects.requireNonNull(discovery);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setIntoto(InTotoResponse intoto) {
            this.intoto = Objects.requireNonNull(intoto);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLongDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder set$package(PackageResponse $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setRelatedNoteNames(List<String> relatedNoteNames) {
            this.relatedNoteNames = Objects.requireNonNull(relatedNoteNames);
            return this;
        }

        public Builder setRelatedUrl(List<RelatedUrlResponse> relatedUrl) {
            this.relatedUrl = Objects.requireNonNull(relatedUrl);
            return this;
        }

        public Builder setSbom(DocumentNoteResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }

        public Builder setSpdxFile(FileNoteResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }

        public Builder setSpdxPackage(PackageInfoNoteResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }

        public Builder setSpdxRelationship(RelationshipNoteResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVulnerability(VulnerabilityResponse vulnerability) {
            this.vulnerability = Objects.requireNonNull(vulnerability);
            return this;
        }
        public GetNoteResult build() {
            return new GetNoteResult(attestationAuthority, baseImage, build, createTime, deployable, discovery, expirationTime, intoto, kind, longDescription, name, $package, relatedNoteNames, relatedUrl, sbom, shortDescription, spdxFile, spdxPackage, spdxRelationship, updateTime, vulnerability);
        }
    }
}