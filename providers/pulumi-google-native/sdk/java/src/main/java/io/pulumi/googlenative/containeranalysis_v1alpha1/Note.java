// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1alpha1.NoteArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationAuthorityResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BasisResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildTypeResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeployableResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveryResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelatedUrlResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityTypeResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new `Note`.
 * 
 */
@ResourceType(type="google-native:containeranalysis/v1alpha1:Note")
public class Note extends io.pulumi.resources.CustomResource {
    /**
     * A note describing an attestation role.
     * 
     */
    @OutputExport(name="attestationAuthority", type=AttestationAuthorityResponse.class, parameters={})
    private Output<AttestationAuthorityResponse> attestationAuthority;

    /**
     * @return A note describing an attestation role.
     * 
     */
    public Output<AttestationAuthorityResponse> getAttestationAuthority() {
        return this.attestationAuthority;
    }
    /**
     * A note describing a base image.
     * 
     */
    @OutputExport(name="baseImage", type=BasisResponse.class, parameters={})
    private Output<BasisResponse> baseImage;

    /**
     * @return A note describing a base image.
     * 
     */
    public Output<BasisResponse> getBaseImage() {
        return this.baseImage;
    }
    /**
     * Build provenance type for a verifiable build.
     * 
     */
    @OutputExport(name="buildType", type=BuildTypeResponse.class, parameters={})
    private Output<BuildTypeResponse> buildType;

    /**
     * @return Build provenance type for a verifiable build.
     * 
     */
    public Output<BuildTypeResponse> getBuildType() {
        return this.buildType;
    }
    /**
     * A note describing a compliance check.
     * 
     */
    @OutputExport(name="compliance", type=ComplianceNoteResponse.class, parameters={})
    private Output<ComplianceNoteResponse> compliance;

    /**
     * @return A note describing a compliance check.
     * 
     */
    public Output<ComplianceNoteResponse> getCompliance() {
        return this.compliance;
    }
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A note describing something that can be deployed.
     * 
     */
    @OutputExport(name="deployable", type=DeployableResponse.class, parameters={})
    private Output<DeployableResponse> deployable;

    /**
     * @return A note describing something that can be deployed.
     * 
     */
    public Output<DeployableResponse> getDeployable() {
        return this.deployable;
    }
    /**
     * A note describing a provider/analysis type.
     * 
     */
    @OutputExport(name="discovery", type=DiscoveryResponse.class, parameters={})
    private Output<DiscoveryResponse> discovery;

    /**
     * @return A note describing a provider/analysis type.
     * 
     */
    public Output<DiscoveryResponse> getDiscovery() {
        return this.discovery;
    }
    /**
     * A note describing a dsse attestation note.
     * 
     */
    @OutputExport(name="dsseAttestation", type=DSSEAttestationNoteResponse.class, parameters={})
    private Output<DSSEAttestationNoteResponse> dsseAttestation;

    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    public Output<DSSEAttestationNoteResponse> getDsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * Time of expiration for this note, null if note does not expire.
     * 
     */
    @OutputExport(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return Time of expiration for this note, null if note does not expire.
     * 
     */
    public Output<String> getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A detailed description of this `Note`.
     * 
     */
    @OutputExport(name="longDescription", type=String.class, parameters={})
    private Output<String> longDescription;

    /**
     * @return A detailed description of this `Note`.
     * 
     */
    public Output<String> getLongDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note in the form "projects/{provider_project_id}/notes/{NOTE_ID}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the note in the form "projects/{provider_project_id}/notes/{NOTE_ID}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    @OutputExport(name="package", type=PackageResponse.class, parameters={})
    private Output<PackageResponse> $package;

    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public Output<PackageResponse> get$package() {
        return this.$package;
    }
    /**
     * URLs associated with this note
     * 
     */
    @OutputExport(name="relatedUrl", type=List.class, parameters={RelatedUrlResponse.class})
    private Output<List<RelatedUrlResponse>> relatedUrl;

    /**
     * @return URLs associated with this note
     * 
     */
    public Output<List<RelatedUrlResponse>> getRelatedUrl() {
        return this.relatedUrl;
    }
    /**
     * A note describing a software bill of materials.
     * 
     */
    @OutputExport(name="sbom", type=DocumentNoteResponse.class, parameters={})
    private Output<DocumentNoteResponse> sbom;

    /**
     * @return A note describing a software bill of materials.
     * 
     */
    public Output<DocumentNoteResponse> getSbom() {
        return this.sbom;
    }
    /**
     * A one sentence description of this `Note`.
     * 
     */
    @OutputExport(name="shortDescription", type=String.class, parameters={})
    private Output<String> shortDescription;

    /**
     * @return A one sentence description of this `Note`.
     * 
     */
    public Output<String> getShortDescription() {
        return this.shortDescription;
    }
    /**
     * A note describing an SPDX File.
     * 
     */
    @OutputExport(name="spdxFile", type=FileNoteResponse.class, parameters={})
    private Output<FileNoteResponse> spdxFile;

    /**
     * @return A note describing an SPDX File.
     * 
     */
    public Output<FileNoteResponse> getSpdxFile() {
        return this.spdxFile;
    }
    /**
     * A note describing an SPDX Package.
     * 
     */
    @OutputExport(name="spdxPackage", type=PackageInfoNoteResponse.class, parameters={})
    private Output<PackageInfoNoteResponse> spdxPackage;

    /**
     * @return A note describing an SPDX Package.
     * 
     */
    public Output<PackageInfoNoteResponse> getSpdxPackage() {
        return this.spdxPackage;
    }
    /**
     * A note describing a relationship between SPDX elements.
     * 
     */
    @OutputExport(name="spdxRelationship", type=RelationshipNoteResponse.class, parameters={})
    private Output<RelationshipNoteResponse> spdxRelationship;

    /**
     * @return A note describing a relationship between SPDX elements.
     * 
     */
    public Output<RelationshipNoteResponse> getSpdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A note describing an upgrade.
     * 
     */
    @OutputExport(name="upgrade", type=UpgradeNoteResponse.class, parameters={})
    private Output<UpgradeNoteResponse> upgrade;

    /**
     * @return A note describing an upgrade.
     * 
     */
    public Output<UpgradeNoteResponse> getUpgrade() {
        return this.upgrade;
    }
    /**
     * A package vulnerability type of note.
     * 
     */
    @OutputExport(name="vulnerabilityType", type=VulnerabilityTypeResponse.class, parameters={})
    private Output<VulnerabilityTypeResponse> vulnerabilityType;

    /**
     * @return A package vulnerability type of note.
     * 
     */
    public Output<VulnerabilityTypeResponse> getVulnerabilityType() {
        return this.vulnerabilityType;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable NoteArgs.Builder a);
    }
    private static io.pulumi.googlenative.containeranalysis_v1alpha1.NoteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.containeranalysis_v1alpha1.NoteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Note(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Note(String name) {
        this(name, NoteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Note(String name, @Nullable NoteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Note(String name, @Nullable NoteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1alpha1:Note", name, args == null ? NoteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Note(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1alpha1:Note", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Note get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Note(name, id, options);
    }
}